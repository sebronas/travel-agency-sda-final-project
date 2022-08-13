package com.sda.travelagency.entity;

public class MealType {
    BREAKFAST("Good morning"),
    LUNCH(""),
    DINNER(""),
    SNACKS(""),
    DRINKS(""),
    HB(""),
    ALL_I-NCLUSIVE("");

    public MealType(String mealDesciption) {
        MealDesciption = mealDesciption;
    }

    private String MealDesciption;

    public String getMealDesciption() {
        return MealDesciption;
    }
}
