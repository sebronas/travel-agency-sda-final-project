package com.sda.travelagency.entity;

import com.sda.travelagency.entity.enumeration.AgeRestrictions;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ATTRACTION")
public class Attraction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String description;

    @Enumerated(EnumType.STRING)
    AgeRestrictions ageRestrictions;

    @ElementCollection
    @CollectionTable(name = "ATTRACTION_PHOTOS")
    @Column(name = "PHOTO")
    List<String> photos;
}
