package com.codecool;
import java.util.Random;
import java.util.Scanner;
import java.lang.Character;

public class Yard{

    private HidingPlaces[] locations = new HidingPlaces[3];
    private int luck;
    private int userChoice;

    Yard(){
        locations[0] = new HidingPlaces("Under a car", 7, 2);
        locations[1] = new HidingPlaces("In the trash", 8, 3);
        locations[2] = new HidingPlaces("Behind Pali bácsi", 6, 2);
        Random rand = new Random();
        luck = rand.nextInt(5) + 0;
        userChoice = 1;
    }

    HidingPlaces[] getLocations(){
        return locations;
    }

    void addNewLocation(String name, int fireQuality, int visibility){
        HidingPlaces newHp = new HidingPlaces(name, fireQuality, visibility);
        HidingPlaces[] tempLocations = new HidingPlaces[locations.length + 1];
        for(int i = 0; i < locations.length; i++){
             tempLocations[i] = locations[i];
        }
        tempLocations[tempLocations.length - 1] = newHp;
        locations = tempLocations;
    }

    void setUserChoice(int userChoice){
        this.userChoice = userChoice;
    }

    boolean getAreYouSeen(){
        int res = locations[userChoice].getVisibility();
        if (res != 0){
            return true;
        }
        else {
            return false;
        }
    }

    boolean calculateResult(){
        HidingPlaces currentPlace = locations[userChoice];
        int INIT_CHANCE = 50;
        int result;
        //this formula is not tested, change the multipliers to align the chance for success 
        result = ((INIT_CHANCE + (currentPlace.getFireQuality() * 5 )) / 2) - (currentPlace.getVisibility() * 6) + (luck * 7);
        if (result > 50){
            return true;
        }
        else {
            return false;
        }        
    }
}
