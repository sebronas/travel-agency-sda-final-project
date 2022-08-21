package com.sda.travelagency.converter;

import com.sda.travelagency.dto.DestinationDto;
import com.sda.travelagency.entity.Destination;
import org.springframework.stereotype.Component;

@Component
public class DestinationConverter implements Converter<Destination, DestinationDto> {

    @Override
    public DestinationDto fromEntityToDto(Destination entity) {
        // TODO
        return null;
    }

    @Override
    public Destination fromDtoToEntity(DestinationDto dto) {
        // TODO
        return null;
    }
}
