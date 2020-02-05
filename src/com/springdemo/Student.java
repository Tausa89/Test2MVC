package com.springdemo;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String,String> countryOption;
    private String favoriteLanguage;
    private String[] operatingSystems;

    public Student() {

        countryOption = new LinkedHashMap<>();
        countryOption.put("PL", "Poland");
        countryOption.put("DE", "Niemcy");
        countryOption.put("BE", "Belgia");
        countryOption.put("NL", "Holandia");
        countryOption.put("IT", "Wlochy");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOption() {
        return countryOption;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
