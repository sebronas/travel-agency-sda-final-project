package com.sda.travelagency.converter;

import com.sda.travelagency.dto.AttractionDto;
import com.sda.travelagency.entity.Attraction;
import org.springframework.stereotype.Component;

@Component
public class AttractionConverter implements Converter<Attraction, AttractionDto> {
    @Override
    public AttractionDto fromEntityToDto(Attraction entity) {
        return new AttractionDto(entity.getDescription(), entity.getAgeRestrictions(), entity.getPhotos());
    }

    @Override
    public Attraction fromDtoToEntity(AttractionDto dto) {
        return new Attraction(dto.description(), dto.ageRestrictions(), dto.photos());
    }
}
