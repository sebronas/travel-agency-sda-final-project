package com.sda.travelagency.converter;

import com.sda.travelagency.dto.DestinationDto;
import com.sda.travelagency.entity.Destination;
import org.springframework.stereotype.Component;

@Component
public class DestinationConverter implements Converter<Destination, DestinationDto> {

    @Override
    public DestinationDto fromEntityToDto(Destination entity) {
        return new DestinationDto(entity.getId(), entity.getCountry(), entity.getCity(), entity.getHotelName());
    }

    @Override
    public Destination fromDtoToEntity(DestinationDto dto) {
        return new Destination(dto.id(), dto.country(), dto.city(), dto.hotelName());
    }
}
