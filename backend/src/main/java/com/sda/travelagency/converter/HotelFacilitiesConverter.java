package com.sda.travelagency.converter;

import com.sda.travelagency.dto.AttractionDto;
import com.sda.travelagency.dto.HotelFacilitiesDto;
import com.sda.travelagency.entity.Attraction;
import com.sda.travelagency.entity.HotelFacilities;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HotelFacilitiesConverter implements Converter<HotelFacilities, HotelFacilitiesDto> {

    private final AttractionConverter attractionConverter;

    public HotelFacilitiesConverter(AttractionConverter attractionConverter) {
        this.attractionConverter = attractionConverter;
    }

    @Override
    public HotelFacilitiesDto fromEntityToDto(HotelFacilities entity) {
        // throw new NotYetImplementedException();    <--- exception if its not finished yet

        // till Java 8 implementation
        List<AttractionDto> attractionDtos = new ArrayList<>(); // creating empty list for attractionsDto
        for (Attraction attraction: entity.getAttractionList()) { // for every
            AttractionDto attractionDto = attractionConverter.fromEntityToDto(attraction); // converting
            attractionDtos.add(attractionDto); // adding to list
        }

        return new HotelFacilitiesDto(attractionDtos, entity.getApartmentFacilities()); // putting attractionDtos
    }

    @Override
    public HotelFacilities fromDtoToEntity(HotelFacilitiesDto dto) {
        return null;
    }
}
