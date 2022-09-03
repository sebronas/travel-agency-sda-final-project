package com.sda.travelagency.dto;

import java.util.List;

public record HotelFacilitiesDto(List<AttractionDto> attraction, List<String> apartmentFacilities) {
}
