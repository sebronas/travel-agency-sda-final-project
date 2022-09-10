package com.sda.travelagency.entity;

import com.sda.travelagency.entity.enumeration.MealType;
import com.sda.travelagency.entity.enumeration.PaymentType;
import com.sda.travelagency.entity.enumeration.TransportType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalDate tripStartDate;

    LocalDate tripEndDate;

    @Transient //ignore that field (temporary)
    Destination destination;

    @Transient //ignore that field (temporary)
    Price tripPrice;

    @Enumerated(value = EnumType.STRING)
    TransportType typeOfTransport;

    @Transient //ignore that field (temporary)
    SecurityRules securityRules;

    @Enumerated(value = EnumType.STRING)
    PaymentType paymentType;

    @Enumerated(value = EnumType.STRING)
    MealType mealType;

    @Transient //ignore that field (temporary)
    HotelFacilities hotelFacilities;

    @Transient //ignore that field (temporary)
    List<String> photos;


}
