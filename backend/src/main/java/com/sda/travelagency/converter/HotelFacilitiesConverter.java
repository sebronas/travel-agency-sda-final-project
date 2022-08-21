package com.sda.travelagency.converter;

import com.sda.travelagency.dto.HotelFacilitiesDto;
import com.sda.travelagency.entity.HotelFacilities;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.stereotype.Component;

// TODO - implement interface
@Component
public class HotelFacilitiesConverter implements Converter<HotelFacilities, HotelFacilitiesDto> {
    @Override
    public HotelFacilitiesDto fromEntityToDto(HotelFacilities entity) {
        throw new NotYetImplementedException();
        //return null;
    }

    @Override
    public HotelFacilities fromDtoToEntity(HotelFacilitiesDto dto) {
        return null;
    }
}
