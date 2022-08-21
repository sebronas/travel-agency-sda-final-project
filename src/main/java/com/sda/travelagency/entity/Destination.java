package com.sda.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Destination {
    String country;

    String city;

    String hotelName;
}
