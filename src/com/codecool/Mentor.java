package com.codecool;

public class Mentor extends Person {
    String nickname;  

    public Mentor(String firstName, String lastName, int yearOfBirth, String gender, int energyLevel, String nickname){
        super(firstName, lastName, yearOfBirth, gender, energyLevel);
        this.nickname = nickname;

    }
    
    public String getNickname(){
        return nickname;
    }
    
}


