package com.codecool;

public class Student extends Person {
    int knowledgeLevel;

    Student(String firstName, String lastName, int yearOfBirth, String gender, int energyLevel, int knowledgeLevel){ 
    super(firstName, lastName, yearOfBirth, gender, energyLevel);
    this.knowledgeLevel = knowledgeLevel;
    }

    public int getKnowledgeLevel(){
        return knowledgeLevel;
    }
}
