package org.example.service;

import org.example.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerValidatorTest {

    private CustomerValidator validator;
    private Customer validCustomer;

    @BeforeEach
    void setUp() {
        validator = new CustomerValidator();
        validCustomer = new Customer();
        validCustomer.setFirstName("Béla");
        validCustomer.setLastName("Kovács");
    }

    @Test
    @DisplayName("Helyesen megadott ügyfeleknek hiba nélkül át kell mennie")
    void testValidCustomerPasses() {
        assertDoesNotThrow(() -> validator.validate(validCustomer));
    }

    @Test
    @DisplayName("Üres customer object esetén IllegalArgumentException(Az ugyfel objektum nem lehet null.)")
    void testNullCustomerThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                validator.validate(null)
        );
        assertEquals("Az ugyfel objektum nem lehet null.", exception.getMessage());
    }

    @Test
    @DisplayName("Üres vagy whitespace-el kezdődő nevek esetén IllegalArgumentException")
    void testEmptyFirstNameThrowsException() {
        validCustomer.setFirstName("   ");
        assertThrows(IllegalArgumentException.class, () -> validator.validate(validCustomer));
    }

    @Test
    @DisplayName("Ha számokat tartalmaz a keresztnév akkor IllegalArgumentException")
    void testFirstNameWithNumbersThrowsException() {
        validCustomer.setFirstName("Bela123");
        assertThrows(IllegalArgumentException.class, () -> validator.validate(validCustomer));
    }

    @Test
    @DisplayName("Túl rövid vezetéknév esetén IllegalArgumentException")
    void testTooShortLastNameThrowsException() {
        validCustomer.setLastName("K");
        assertThrows(IllegalArgumentException.class, () -> validator.validate(validCustomer));
    }

    @Test
    @DisplayName("Kötőjeles nevek esetén (pl. Kiss-Nagy) hiba nélkül le kell hogy fusson")
    void testHyphenatedNamePasses() {
        validCustomer.setLastName("Kiss-Nagy");
        assertDoesNotThrow(() -> validator.validate(validCustomer));
    }
}