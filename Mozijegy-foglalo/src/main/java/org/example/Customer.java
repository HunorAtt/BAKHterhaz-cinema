package org.example;

import org.example.service.CustomerValidator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Integer id;
    private static Integer customerCounter = 0; // ideiglenes megoldas amig nincs adatbazis
    private String firstName;
    private String lastName;
    private String mail;
    private String password;
    private Discount discount;

    /**
     * Felhasznalo letrehozasa
     *
     * @param firstName
     * @param lastName
     * @param mail
     * @param password
     * @param discount
     */
    public Customer(String firstName, String lastName, String mail, String password, Discount discount) {
        setFirstName(firstName);
        setLastName(lastName);
        setMail(mail);
        setPassword(password);
        this.discount = discount;
        id = customerCounter++;
    }

    public Customer(String firstName, String lastName, String mail, String password) {
        this(firstName, lastName, mail, password, Discount.none);
    }

    /**
     * CSAK DEBUG CELRA HASZNALANDO! (kap id-t)
     */
    public Customer() {
        this("Gipsz", "Jakab", "gipsz.jakab@gmail.hu", "Jelszo123", Discount.none);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", discount=" + discount +
                '}';
    }

}
