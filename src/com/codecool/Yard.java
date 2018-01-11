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

    public static void main(String[] arg){
        Yard newYard = new Yard();
        HidingPlaces[] newList = newYard.getLocations();
        for (HidingPlaces item: newList){
            System.out.println(item.name);
        }
        Scanner scanner = new Scanner(System.in);
        char charInput;
        int fireLightHardness;
        int trespassers;

        while (true) {
            System.out.println("Do you see a better location? ('y' or 'n')");
            charInput = scanner.next().charAt(0);
            charInput = Character.toLowerCase(charInput);
            if (charInput == 'y' || charInput == 'n'){
                break;
            }
        }
        
        if (charInput == 'y'){
            System.out.println("What is the name of your perfect place?");
            String placeName = scanner.next();
            while (true){
                System.out.println("How big fire can you make at that place from 0 to 10?");
                fireLightHardness = scanner.nextInt();
                if (fireLightHardness >= 0 && fireLightHardness <= 10){
                    break;
                }
            }
            while (true) {
                System.out.println("How many ppl can notice you in the glory process? (from 0 to 3)");
                trespassers = scanner.nextInt();
                if (trespassers >= 0 && trespassers <= 3){
                    break;
                }
            }            
            
            newYard.addNewLocation(placeName, fireLightHardness, trespassers);
            newList = newYard.getLocations();
        }
        
        
        for (int i = 0; i < newList.length; i++){
            System.out.println((i + 1) + " Available places: " + newList[i].name);
        }
        int chooseLocation;
        do {
            System.out.println("Choose a location: ");
            chooseLocation = scanner.nextInt();
        } 
        while (chooseLocation <= newList.length + 1 && chooseLocation >= newList.length + 1);
        
        if (chooseLocation == 0){
            newYard.setUserChoice(newList.length - 1);
        }
        else {
            newYard.setUserChoice(chooseLocation - 1);
        }
        
        System.out.println("check set user choice :: " + newList[newList.length - 1].name);

        boolean haveBoose = newYard.calculateResult();
        if (haveBoose){
            System.out.println("Success, the stuednt gained 16.5g alchol. now he is super happy!");
        }
        else{
            System.out.println("Failure! Some nasty old lady called the police, your penalty is 53672Ft plus you don't have alcohol now. Outstanding!");
        }

        
        scanner.close();
    }
}