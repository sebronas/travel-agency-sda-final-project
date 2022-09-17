package com.sda.travelagency.dto;

import java.util.List;

public record HotelFacilitiesDto(Long id, List<AttractionDto> attractions, List<String> apartmentFacilities) {
}
