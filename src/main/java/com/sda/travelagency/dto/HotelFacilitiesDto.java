package com.sda.travelagency.dto;

import com.sda.travelagency.entity.Attraction;

import java.util.List;

public record HotelFacilitiesDto(List<AttractionDto> attractionList, List<String> apartmentFacilities) {
}
