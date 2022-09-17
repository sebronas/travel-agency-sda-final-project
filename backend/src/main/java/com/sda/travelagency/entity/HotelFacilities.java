package com.sda.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HOTEL_FACILITIES")
public class HotelFacilities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Transient
    List<Attraction> attractions;

    @ElementCollection
    @CollectionTable(name = "APARTMENT_FACILITIES")
    @Column(name = "APARTMENT_FACILITY")
    List<String> apartmentFacilities;
}
