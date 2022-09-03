package com.sda.travelagency.converter;

import com.sda.travelagency.dto.HotelFacilitiesDto;
import com.sda.travelagency.entity.HotelFacilities;
import org.springframework.stereotype.Component;

@Component
public class HotelFacilitiesConverter implements Converter<HotelFacilities, HotelFacilitiesDto> {
    @Override
    public HotelFacilitiesDto fromEntityToDto(HotelFacilities entity) {
        // throw new NotYetImplementedException();    <--- exception if its not finished yet
        return null;
    }

    @Override
    public HotelFacilities fromDtoToEntity(HotelFacilitiesDto dto) {
        return null;
    }
}
