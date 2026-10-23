package org.example.service;

public class PricingService {

    public static final int BASE_TICKET_PRICE = 2500;
    public static final double STUDENT_DISCOUNT_RATE = 0.20; // 20% kedvezmeny
    public static final double SENIOR_DISCOUNT_RATE = 0.25;  // 25% kedvezmeny

    public int calculatePrice(int ticketCount, boolean isStudent, boolean isSenior) {
        if (ticketCount <= 0) {
            throw new IllegalArgumentException("A jegyek szama legalabb 1 kell legyen.");
        }
        if (isStudent && isSenior) {
            throw new IllegalArgumentException("Egy jegyhez nem tartozhat egyszerre diak es nyugdijas kedvezmeny.");
        }

        double pricePerTicket = BASE_TICKET_PRICE;

        if (isStudent) {
            pricePerTicket -= (BASE_TICKET_PRICE * STUDENT_DISCOUNT_RATE);
        } else if (isSenior) {
            pricePerTicket -= (BASE_TICKET_PRICE * SENIOR_DISCOUNT_RATE);
        }

        return (int) Math.round(pricePerTicket * ticketCount);
    }
}
