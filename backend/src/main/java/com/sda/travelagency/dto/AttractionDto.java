package com.sda.travelagency.dto;

import com.sda.travelagency.entity.enumeration.AgeRestrictions;

import java.util.List;

public record AttractionDto(Long id, String description, AgeRestrictions ageRestrictions, List<String> photos) {

}
