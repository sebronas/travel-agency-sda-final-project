package com.sda.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Attraction {

    String description;

    AgeRestrictions ageRestrictions;

}
