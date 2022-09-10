package com.sda.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SecurityRules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String travelRestrictions;

    String insurance;
}