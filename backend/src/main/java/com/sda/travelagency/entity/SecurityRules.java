package com.sda.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SecurityRules {
    String travelRestrictions;

    String insurance;
}