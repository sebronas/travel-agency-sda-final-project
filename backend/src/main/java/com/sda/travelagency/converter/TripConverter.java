package com.sda.travelagency.converter;

import com.dto.TripDto;
import com.sda.travelagency.entity.Price;
import com.sda.travelagency.entity.Trip;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class TripConverter implements Converter<Trip, TripDto> {

    private final DestinationConverter destinationConverter;
    private final SecurityRulesConverter securityRulesConverter;
    private final HotelFacilitiesConverter hotelFacilitiesConverter;

    public TripConverter(DestinationConverter destinationConverter, SecurityRulesConverter securityRulesConverter, HotelFacilitiesConverter hotelFacilitiesConverter) {
        this.destinationConverter = destinationConverter;
        this.securityRulesConverter = securityRulesConverter;
        this.hotelFacilitiesConverter = hotelFacilitiesConverter;
    }


    @Override
    public TripDto fromEntityToDto(Trip trip) {

        var destinationDto = destinationConverter.fromEntityToDto(trip.getDestination());
        var securityRulesDto = securityRulesConverter.fromEntityToDto(trip.getSecurityRules());
        var hotelFacilitiesDto = hotelFacilitiesConverter.fromEntityToDto(trip.getHotelFacilities());

        return TripDto.builder()
                .tripStartDate(trip.getTripStartDate())
                .tripEndDate(trip.getTripEndDate())
                .destination(destinationDto)
                .cost(trip.getTripPrice().getCost().toString())
                .currency(trip.getTripPrice().getCurrency())
                .typeOfTransport(trip.getTypeOfTransport())
                .securityRules(securityRulesDto)
                .paymentType(trip.getPaymentType())
                .mealType(trip.getMealType())
                .hotelFacilities(hotelFacilitiesDto)
                .photos(trip.getPhotos())
                .build();
    }

    @Override
    public Trip fromDtoToEntity(TripDto tripDto) {

        var destinationEntity = destinationConverter.fromDtoToEntity(tripDto.destination());
        var tripPrice = new Price(new BigDecimal(tripDto.cost()), tripDto.currency());
        var securityEntity = securityRulesConverter.fromDtoToEntity(tripDto.securityRules());
        var hotelFacilitiesEntity = hotelFacilitiesConverter.fromDtoToEntity(tripDto.hotelFacilities());

        return Trip.builder()
                .tripStartDate(tripDto.tripStartDate())
                .tripEndDate(tripDto.tripEndDate())
                .destination(destinationEntity)
                .tripPrice(tripPrice)
                .typeOfTransport(tripDto.typeOfTransport())
                .securityRules(securityEntity)
                .paymentType(tripDto.paymentType())
                .mealType(tripDto.mealType())
                .hotelFacilities(hotelFacilitiesEntity)
                .photos(tripDto.photos())
                .build();
    }
}
