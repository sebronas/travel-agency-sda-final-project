package com.sda.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Price {

    BigDecimal cost;

    String currency;
}
