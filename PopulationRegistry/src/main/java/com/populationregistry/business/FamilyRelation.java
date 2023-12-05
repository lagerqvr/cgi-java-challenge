package com.populationregistry.business;

public class FamilyRelation {
    private Person relatedPerson; // Reference to another Person object
    private String relationType; // Relation type, for example "spouse" etc.

    // Constructor without parameters
    public FamilyRelation() {
    }

    // Constructor with parameters
    public FamilyRelation(Person relatedPerson, String relationType) {
        this.relatedPerson = relatedPerson;
        this.relationType = relationType;
    }

    // Basic getters and setters
    public Person getRelatedPerson() {
        return relatedPerson;
    }

    public void setRelatedPerson(Person relatedPerson) {
        this.relatedPerson = relatedPerson;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    // toString method for printing relationship details
    @Override
    public String toString() {
        // In a real-world project, I would avoid including the related person's details in the toString method
        // to prevent potential repeated calls that could lead to an error. For simplicity, this is okay.
        return "FamilyRelation{" +
                "relatedPersonName='" + (relatedPerson != null ? relatedPerson.getName() : "N/A") + '\'' +
                ", relationType='" + relationType + '\'' +
                '}';
    }
}

