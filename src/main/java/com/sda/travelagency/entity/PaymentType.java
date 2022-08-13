package com.sda.travelagency.entity;

public enum PaymentType {
    CASH("pay with cash"),
    CARD("visa or mastercard"),
    TRANSFER("bank transfer"),
    APPLE_PAY("pay with iPhone"),
    GOOGLE_PAY("pay with Android phone"),
    PAYPAL("elon would You pay"),
    INSTALLMENT_PAYMENT("just installment pay");

  /*  public static void main(String[] args) {
        PaymentType CASH = new PaymentType();
    }*/
    private String description;

    PaymentType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
