package model.entities;

import tools.RegexValidator;

import java.util.Scanner;

public class Contact {

    private String name;
    private String phoneNumber;
    private String email;

    private Contact (String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static Contact createContact(Scanner scanner) {
        RegexValidator validator = new RegexValidator(scanner);
        String name = validator.validateOnlyLettersName();
        String phoneNumber = validator.validateOnlyNumbersPhone();
        String email = validator.validateEmailFormat();
        return new Contact(name, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "Nome: " + name + "\nTelefone: " + phoneNumber + "\nE-mail: " + email;
    }
}



