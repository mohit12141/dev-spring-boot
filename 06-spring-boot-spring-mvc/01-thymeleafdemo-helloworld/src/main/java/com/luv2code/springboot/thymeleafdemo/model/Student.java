package com.luv2code.springboot.thymeleafdemo.model;

public class Student {

    private String firstName;

    private String lastName;

    private String country;

    private String favouriteLanguage;

    private String favoriteSystems;

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteSystems() {
        return favoriteSystems;
    }

    public void setFavoriteSystems(String favoriteSystems) {
        this.favoriteSystems = favoriteSystems;
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

    public Student() {

    }


}
