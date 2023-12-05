package com.populationregistry.business;

public class Citizenship {
    private String countryName;
    private boolean isPrimary;

    // Constructor without parameters
    public Citizenship() {
    }

    // Constructor with parameters
    public Citizenship(String countryName, boolean isPrimary) {
        this.countryName = countryName;
        this.isPrimary = isPrimary;
    }

    // Basic getters and setters
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }

    // toString method to print citizenship details
    @Override
    public String toString() {
        return "Citizenship{" +
                "countryName='" + countryName + '\'' +
                ", isPrimary=" + isPrimary +
                '}';
    }
}

