package com.codecool;

public class Person {

    public String firstName;
    public String lastName; 
    public int yearOfBirth;
    public String gender;
    public int energyLevel;


    public Person(String firstName, String lastName, int yearOfBirth, String gender, int energyLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.energyLevel = energyLevel;

    }

    String getPersonalName(){
        return firstName + " " + lastName;
    }

    int getPersonAge(){
        return yearOfBirth;
    }

    String getPersonGender(){
        return gender;
    }

    int getEnergyLevel(){
        return energyLevel;
    }

    void setEnergyLevel(int level){
        energyLevel = level;
    }
}
