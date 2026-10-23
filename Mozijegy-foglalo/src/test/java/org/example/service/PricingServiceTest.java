package org.example.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PricingServiceTest {

    private PricingService pricingService;

    @BeforeEach
    void setUp() {
        pricingService = new PricingService();
    }

    @Test
    @DisplayName("A jegy ára meg kell egyezzen a BASE_TICKET_PRICE-al")
    void testStandardTicketPrice() {
        int total = pricingService.calculatePrice(1, false, false);
        assertEquals(2500, total);
    }

    @Test
    @DisplayName("A diák kedvezmény le kell hogy vonjon 20 százalékot.")
    void testStudentDiscountApplied() {
        int total = pricingService.calculatePrice(1, true, false);
        assertEquals(2000, total);
    }

    @Test
    @DisplayName("A nulla jegyszám esetén IllegalArgumentException")
    void testZeroTicketCountThrowsException() {
        assertThrows(IllegalArgumentException.class, () ->
                pricingService.calculatePrice(0, false, false)
        );
    }

    @Test
    @DisplayName("Negatív jegyszám szám esetén IllegalArgumentException")
    void testNegativeTicketCountThrowsException() {
        assertThrows(IllegalArgumentException.class, () ->
                pricingService.calculatePrice(-1, false, false)
        );
    }
}
