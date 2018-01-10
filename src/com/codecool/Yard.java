package com.codecool;
import java.util.Random;

public class Yard{

    private HidingPlaces[] locations = new HidingPlaces[3];
    private int luck;
    private int userChoice;

    Yard(){
        locations[0] = new HidingPlaces("Under a car", 7, 2);
        locations[1] = new HidingPlaces("In the trash", 8, 3);
        locations[2] = new HidingPlaces("Behind Pali bácsi", 6, 2);
        luck = rand.nextInt(5) + 0;
        userChoice = 1;
    }

    HidingPlaces getLocations(){
        return locations;
    }

    void addNewLocation(String name, int fireQuality, int visibility){
        HidingPlaces newHp = new HidingPlaces(name, fireQuality, visibility);
        HidingPlaces[] tempLocations = new HidingPlaces[locations.length + 1];
        for(int i = 0; i < tempLocations.length; i++){
             tempLocations[i] = locations[i];
        }
        tempLocations[locations.length] = newHp;
        locations = tempLocations;
    }

    void setUserChoice(int userChoice){
        this.userChoice = userChoice;
    }

    boolean getAreYouSeen(){
        int res = locations[userChoice].getVisibility();
        return res;
    }

    boolean calculateResult(){
        if(luck < locations[userChoice].getVisibility()){
            return false;
        }
        return true;
    }
}