package com.populationregistry.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PersonTest {

    private Person person;
    private Date birthDate;
    private Date deathDate;
    private Address address;

    @BeforeEach
    void setUp() {
        // Set up some test data
        birthDate = new Date();
        deathDate = null;
        address = new Address();
        Citizenship citizenship = new Citizenship("Finland", true);
        FamilyRelation familyRelation = new FamilyRelation();

        // Create a new Person object before each test
        person = new Person("Matti Meikäläinen", "123456-7890", address, List.of(citizenship),
                "Finnish", List.of(familyRelation), birthDate, deathDate,
                "Finnish", "Single");
    }

    // Example tests
    @Test
    void getName_ShouldReturnCorrectName() {
        assertEquals("Matti Meikäläinen", person.getName());
    }

    @Test
    void setName_ShouldUpdateName() {
        person.setName("Maija Meikäläinen");
        assertEquals("Maija Meikäläinen", person.getName());
    }

    @Test
    void getPersonalIdentificationNumber_ShouldReturnCorrectNumber() {
        assertEquals("123456-7890", person.getPersonalIdentificationNumber());
    }

    @Test
    void getAddress_ShouldReturnCorrectAddress() {
        assertEquals(address, person.getAddress());
    }

    // Example test for the list of citizenships
    @Test
    void getCitizenships_ShouldReturnListOfCitizenships() {
        List<Citizenship> citizenships = person.getCitizenships();
        assertFalse(citizenships.isEmpty(), "Citizenships list should not be empty");
        assertEquals("Finland", citizenships.get(0).getCountryName());
    }

    // Test for toString method
    @Test
    void toString_ShouldReturnExpectedString() {
        String expected = "Person{name='Matti Meikäläinen', personalIdentificationNumber='123456-7890', address=" + address.toString() +
                ", citizenships=" + person.getCitizenships().toString() +
                ", nativeLanguage='Finnish', familyRelations=" + person.getFamilyRelations().toString() +
                ", birthDate=" + birthDate +
                ", deathDate=" + deathDate +
                ", nationality='Finnish', maritalStatus='Single'}";
        assertEquals(expected, person.toString());
    }
}
