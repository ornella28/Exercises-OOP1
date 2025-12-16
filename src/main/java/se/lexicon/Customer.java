package se.lexicon;

import java.time.LocalDate;

public class Customer {

    private int customerId;
    private String name;
    private String email;
    private LocalDate birthDate;


    //creating constructor to initialize the fields

    public Customer(int customerId, String name, String email, LocalDate birthDate) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    //Generate Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name== null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email== null || email.trim().isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Email cannot be null, empty, and must contain '@'");
        }
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        if (birthDate == null || birthDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Birth date cannot be null or in the future");
        }
        this.birthDate = birthDate;
    }
// creating a method override toString to return the customer information
    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name + ", Email: " + email + ", Birth Date: " + birthDate;
    }
}
