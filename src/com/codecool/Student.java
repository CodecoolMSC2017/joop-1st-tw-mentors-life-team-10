package com.codecool;

public class Student extends Person {

    int knowledgeLevel;

    Student(String firstName, String lastName, int yearOfBirth, String gender, int knowledgeLevel, int energyLevel){ 
    super(firstName, lastName, yearOfBirth, gender, energyLevel);
    knowledgeLevel = 100;
    }

    int getKnowledgeLevel(){
        return knowledgeLevel;
    }
}
