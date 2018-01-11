package com.codecool;

import java.util.Scanner;
import java.lang.Iterable;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;

public class Story {

    public void waiting(){
        try{
            System.in.read();
        }
        catch (Exception e) {
            System.out.println("An unknown error has occured.");
            System.exit(2);
        }
    }
    

    public static void main(String[] args) {
        CodecoolClass localClass = CodecoolClass.createLocal();
        Story story = new Story();

        if (args.length != 2){
            System.out.println("Error: 2 input argument is needed!");
            System.exit(1);
        }

        String mentorFullName = args[0];
        String studentFullName = args[1];

        Mentor localMentor = localClass.findMentorByFullName(mentorFullName);
        if(localMentor == null){
            System.out.println("No mentor named " + mentorFullName + " was found.");
            System.exit(1);
        }

        Student localStudent = localClass.findStudentByFullName(studentFullName);

        if(localStudent == null){
            System.out.println("No student named " + studentFullName + " was found.");
            System.exit(1);
        }

        System.out.println("Mentor " + mentorFullName + "was found, cool! ");
        System.out.println("Student " + studentFullName + " was found,cool!");

        System.out.println(" -- Let the story begin! -- ");

        System.out.format("%s has entered to the Hangar and says Hi!\n" , studentFullName);
        story.waiting();       
        System.out.format("%s notice him and happily jumps to there as a bunny, then hug him.\n", mentorFullName);
        story.waiting();
        System.out.format("%s mentor notice that %s student`s at %d energy level. That`s too low!\n", mentorFullName, studentFullName, localStudent.getEnergyLevel());
        story.waiting();
        System.out.format("%s bring %s to the kitchen to feed him.\n", mentorFullName, studentFullName);

        Kitchen localKitchen = new Kitchen();
        System.out.println("Let's see what they find: ");
        localKitchen.feedThePerson();
        System.out.println("....Yuck!");

        story.waiting();
        System.out.format("%s mentor feels like he quickly have to use the toilet, so run out.\n", mentorFullName);
        Wc localWc = new Wc("towel");

        story.waiting();
        System.out.format("%s starts to eat like a pig.\n", studentFullName);
        localKitchen.eatLikeAPig();
        localStudent.setEnergyLevel(100);

        story.waiting();
        System.out.format("%s hearing satisfied noises from the toilet.\n", studentFullName);
        localWc.setStinkLevel(9000);

        story.waiting();
        System.out.format("%s mentor finished his act, and streching out for toilet paper...\n", mentorFullName);
        if (localWc.getToiletPaper()){
            story.waiting();
            System.out.format("%s mentor use the paper.\n", mentorFullName);
        }
        else {
            story.waiting();
            System.out.format("%s mentor did not found a toilet paper, and start to search replacement obejct while swearing.\n", mentorFullName);
        }
        story.waiting();
        System.out.format("%s mentor succesfull find a replacement tool: %s.\n", mentorFullName, localWc.getReplacementTool());
        story.waiting();
        System.out.format("%s mentor step out after done, put back the %s to it's place like nothing happened, and whatch himself in the mirror.\n", mentorFullName, localWc.getReplacementTool());
        story.waiting();
        System.out.format("%s check himself if beauty enough for teaching.\n", mentorFullName);
        if (!localWc.getBeauty()){
            story.waiting();
            System.out.format("%s do some make up with his rose red lipstick.\n", mentorFullName);
            localWc.setBeauty();
            story.waiting();
            System.out.format("%s check himself again. Perfect!\n", mentorFullName);
        }
        story.waiting();
        System.out.format("%s exits from the toilet.\n", mentorFullName);
        story.waiting();
        System.out.format("%s student smells something wierd while eating... The stink level is over %d.\n", studentFullName, localWc.getStinkLevel());
        story.waiting();
        System.out.println("Stops eating.");
        if (!localKitchen.isClean()){
            story.waiting();
            System.out.format("%s mentor enters the kitchen and see the mess the %s student made!\n", mentorFullName, studentFullName);
            story.waiting();
            System.out.println("The mentor start to shout and force " + studentFullName + " to clean up.");
            localKitchen.doTheDirtyJob();
            localStudent.setEnergyLevel(5);
        }
        story.waiting();
        System.out.format("%s mentor see that the student energy level is at %d. That's critically low! Need an emergency operation!\n", mentorFullName, localStudent.getEnergyLevel());
        story.waiting();
        System.out.println("The mentor quickly bring out his compact emergency destillator from his backpack and a jar of fermented fruit. ");
        story.waiting();
        System.out.format("%s and %s jump out the window to make some booze. Unfortunately they can't go more far, because they can live without the wifi range more then 30 seconds, therefore they need a good hiding place close.\n", mentorFullName, studentFullName);
        
        Yard newYard = new Yard();
        HidingPlaces[] newList = newYard.getLocations();
        for (int i = 0; i < newList.length; i++){
            System.out.println((i + 1) + " Available places: " + newList[i].name);
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
        
        try {
            if (charInput == 'y'){
                System.out.println("What is the name of your perfect place?");
                String placeName = scanner.nextLine();
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
                System.out.println("check set user choice :: " + newList[newList.length - 1].name);
            }
        }
        catch (Exception e) {
            System.out.println("Wrong input!");
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
