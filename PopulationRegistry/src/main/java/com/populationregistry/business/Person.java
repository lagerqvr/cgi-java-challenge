package com.populationregistry.business;

import java.util.Date;
import java.util.List;

public class Person {
    private String name;
    private String personalIdentificationNumber;
    private Address address;
    private List<Citizenship> citizenships;
    private String nativeLanguage;
    private List<FamilyRelation> familyRelations;
    private Date birthDate;
    private Date deathDate;
    private String nationality;
    private String maritalStatus;

    // Constructor without parameters
    public Person() {
    }

    // Constructor with parameters
    public Person(String name, String personalIdentificationNumber, Address address, List<Citizenship> citizenships,
                  String nativeLanguage, List<FamilyRelation> familyRelations, Date birthDate, Date deathDate,
                  String nationality, String maritalStatus) {
        this.name = name;
        this.personalIdentificationNumber = personalIdentificationNumber;
        this.address = address;
        this.citizenships = citizenships;
        this.nativeLanguage = nativeLanguage;
        this.familyRelations = familyRelations;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.nationality = nationality;
        this.maritalStatus = maritalStatus;
    }

    // Basic getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalIdentificationNumber() {
        return personalIdentificationNumber;
    }

    public void setPersonalIdentificationNumber(String personalIdentificationNumber) {
        this.personalIdentificationNumber = personalIdentificationNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Citizenship> getCitizenships() {
        return citizenships;
    }

    public void setCitizenships(List<Citizenship> citizenships) {
        this.citizenships = citizenships;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public List<FamilyRelation> getFamilyRelations() {
        return familyRelations;
    }

    public void setFamilyRelations(List<FamilyRelation> familyRelations) {
        this.familyRelations = familyRelations;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    // toString method for displaying person's information
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personalIdentificationNumber='" + personalIdentificationNumber + '\'' +
                ", address=" + address +
                ", citizenships=" + citizenships +
                ", nativeLanguage='" + nativeLanguage + '\'' +
                ", familyRelations=" + familyRelations +
                ", birthDate=" + birthDate +
                ", deathDate=" + deathDate +
                ", nationality='" + nationality + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                '}';
    }
}

