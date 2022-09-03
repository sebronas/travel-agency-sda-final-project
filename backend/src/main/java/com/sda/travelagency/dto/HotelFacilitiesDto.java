package com.sda.travelagency.dto;

import java.util.List;

public record HotelFacilitiesDto(List<AttractionDto> attractionList, List<String> apartmentFacilities) {
}
