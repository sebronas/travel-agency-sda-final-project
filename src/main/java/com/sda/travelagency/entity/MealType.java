package com.sda.travelagency.entity;

public enum MealType {
    BREAKFAST("Morning food"),
    LUNCH("Food for the day"),
    DINNER("Food for the evening"),
    SNACKS("If you didn't have enough"),
    DRINKS("Liquid to help you sleep, pick your poison (VODKA/SPIRIT)"),
    HB(""),
    ALL_INCLUSIVE("You get it all!");

    private String mealDescription;

    MealType(String mealDescription) {
        this.mealDescription = mealDescription;
    }

    public String getMealDescription() {
        return mealDescription;
    }
}