package org.example.service;

import org.example.Customer;

public class CustomerValidator {

    //Magyar betűket, kötőjelet és szóközt engedélyez, 2–50 karakter hosszúságban.
    private static final String NAME_REGEX = "^[a-zA-ZáéíóöőúüűÁÉÍÓÖŐÚÜŰ\\-\\s]{2,50}$";

    public void validate(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Az ugyfel objektum nem lehet null.");
        }

        validateName(customer.getFirstName(), "Keresztnev");
        validateName(customer.getLastName(), "Vezeteknev");
    }

    private void validateName(String name, String fieldName) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " megadasa kotelezo.");
        }

        String trimmedName = name.trim();

        if (!trimmedName.matches(NAME_REGEX)) {
            throw new IllegalArgumentException(
                    fieldName + " ervenytelen! Csak betuket tartalmazhat, es 2-50 karakter hosszu kell legyen."
            );
        }
    }

    // TODO: Amint bővítve van a Customer entitást (isStudent / isSenior / age mezőkkel),
    //  itt kell ellenőrizni, hogy egy ügyfél nem jelölhet-e meg egyszerre diák és nyugdíjas státuszt, illetve nem lehet fiatalon senior.
}