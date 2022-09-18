package com.sda.travelagency.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public record DestinationDto(
        Long id,

        @Size(min = 4)
        @NotNull
        String country,

        @NotNull
        @Size(min = 2)
        String city,

        @NotNull
        @Size(min = 3, max = 256)
        String hotelName) {
}
