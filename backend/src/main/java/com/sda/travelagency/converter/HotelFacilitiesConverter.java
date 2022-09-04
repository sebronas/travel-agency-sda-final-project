package com.sda.travelagency.converter;

import com.sda.travelagency.dto.HotelFacilitiesDto;
import com.sda.travelagency.entity.HotelFacilities;
import org.springframework.stereotype.Component;

@Component
public class HotelFacilitiesConverter implements Converter<HotelFacilities, HotelFacilitiesDto> {

    private final AttractionConverter attractionConverter;

    public HotelFacilitiesConverter(AttractionConverter attractionConverter) {
        this.attractionConverter = attractionConverter;
    }

    // till Java 8 implementation
    /*@Override
    public HotelFacilitiesDto fromEntityToDto(HotelFacilities entity) {
        // throw new NotYetImplementedException();    <--- exception if its not finished yet


        List<AttractionDto> attractionDtos = new ArrayList<>(); // creating empty list for attractionsDto
        for (Attractions attractions: entity.getAttractions()) { // for every
            AttractionDto attractionDto = attractionConverter.fromEntityToDto(attractions); // converting
            attractionDtos.add(attractionDto); // adding to list
        }

        return new HotelFacilitiesDto(attractionDtos, entity.getApartmentFacilities()); // putting attractionDtos
    }*/

    // since JAVA 8 style - more preferred
    @Override
    public HotelFacilitiesDto fromEntityToDto(HotelFacilities entity) {
        var attractionsDtos = entity.getAttractions().stream()
            //  .map(attraction -> attractionConverter.fromEntityToDto(attraction))
                .map(attractionConverter::fromEntityToDto)
                .toList();

        return new HotelFacilitiesDto(attractionsDtos, entity.getApartmentFacilities());
    }

    @Override
    public HotelFacilities fromDtoToEntity(HotelFacilitiesDto dto) {
        var entities = dto.attractions().stream()
          //    .map(attractionDto -> attractionConverter.fromDtoToEntity(attractionDto))
                .map(attractionConverter::fromDtoToEntity)
                .toList();

        return new HotelFacilities(entities, dto.apartmentFacilities());
    }
}
