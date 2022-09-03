package com.sda.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class HotelFacilities {
    List<Attraction> attractions;

    List<String> apartmentFacilities;
}
