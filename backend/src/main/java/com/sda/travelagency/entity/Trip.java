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
@Table(name = "TRIPS")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalDate tripStartDate;

    LocalDate tripEndDate;

    //@Transient //ignore that field (temporary)
    @OneToOne
    Destination destination;

    @Embedded
    Price tripPrice;

    @Enumerated(value = EnumType.STRING) // by default - ordinal, and that means it will creat integers, not strings
    TransportType typeOfTransport;

    @OneToOne
    SecurityRules securityRules;

    @Enumerated(value = EnumType.STRING)
    PaymentType paymentType;

    @Enumerated(value = EnumType.STRING)
    MealType mealType;

    @OneToOne
    HotelFacilities hotelFacilities;

    @ElementCollection // it will create different tables for those photos - we used it, because we aren't able to config List<String>
    @CollectionTable(name = "PHOTOS" /* this annotation is for just change table name */, joinColumns = @JoinColumn(name = "ID_OF_TRIP"))
    // TODO: video after lunch - explanation / for revising
    @Column(name = "PHOTO")
    List<String> photos;


}
