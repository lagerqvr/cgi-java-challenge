package com.populationregistry.business;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create instance of the Address class
        Address address = new Address("Joukahaisenkatu 1", "Turku", "20520", "Finland");

        // Create instance of the Citizenship class
        Citizenship citizenship = new Citizenship("Finland", true);

        // Create instance of the FamilyRelation class
        FamilyRelation familyRelation = new FamilyRelation(new Person(), "spouse");

        // Create instance of the Person class as an example
        Person person = new Person();
        person.setName("Matti Meikäläinen");
        person.setPersonalIdentificationNumber("123456-7890");
        person.setAddress(address);
        person.setCitizenships(List.of(citizenship));
        person.setNativeLanguage("Finnish");
        person.setFamilyRelations(List.of(familyRelation));
        person.setBirthDate(new Date());
        person.setDeathDate(null);
        person.setNationality("Finnish");
        person.setMaritalStatus("Single");

        // Output the example Person "Matti Meikäläinen"
        System.out.println(person);
    }
}
