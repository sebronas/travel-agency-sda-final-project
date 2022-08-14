package com.sda.travelagency.dto;

import com.sda.travelagency.entity.Destination;
import com.sda.travelagency.entity.HotelFacilities;
import com.sda.travelagency.entity.Price;
import com.sda.travelagency.entity.SecurityRules;
import com.sda.travelagency.entity.enumeration.MealType;
import com.sda.travelagency.entity.enumeration.PaymentType;
import com.sda.travelagency.entity.enumeration.TransportType;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Builder
public record TripDto(
        LocalDate tripStartDate,
        LocalDate tripEndDate,
        Destination destination, // TODO: use dto
        Price tripPrice, // TODO: should we use dto?
        TransportType typeOfTransport,
        SecurityRules securityRules, // TODO: use dto
        PaymentType paymentType,
        MealType mealType,
        HotelFacilities hotelFacilities, // TODO: use dto
        List<String> photos

        ) {
}
