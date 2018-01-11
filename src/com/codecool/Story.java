package com.codecool;
import java.util.Scanner;
import java.lang.Iterable;

public class Story {

    public static void main(String[] args) {
        CodecoolClass localClass = CodecoolClass.createLocal();
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

        System.out.format("%s has entered to the Hangar and says Hi!\n" , studentFullName);
        System.out.format("%s notice him and happily jumps to there as a bunny, then hug him.\n", mentorFullName);
        System.out.format("%s mentor notice that %s student`s at %d energy level. That`s too low!\n", mentorFullName, studentFullName, localStudent.getEnergyLevel());
        System.out.format("%s bring %s to the kitchen to feed him.\n", mentorFullName, studentFullName);

        Kitchen localKitchen = new Kitchen();
        System.out.println("Let's see what they find: ");
        localKitchen.feedThePerson();
        System.out.println("....Yuck!");

        System.out.format("%s mentor feels like he quickly have to use the toilet, so run out.\n", mentorFullName);
        Wc localWc = new Wc("towel");

        System.out.format("%s starts to eat like a pig.\n", studentFullName);
        localKitchen.eatLikeAPig();
        localStudent.setEnergyLevel(100);

        System.out.format("%s hearing satisfied noises from the toilet.\n", studentFullName);
        localWc.setStinkLevel(9000);

        System.out.format("%s mentor finished his act, and streching out for toilet paper...\n", mentorFullName);
        if (localWc.getToiletPaper()){
            System.out.format("%s mentor use the paper.\n", mentorFullName);
        }
        else {
            System.out.format("%s mentor did not found a toilet paper, and start to search replacement obejct while swearing.\n", mentorFullName);
        }
        System.out.format("%s mentor succesfull find a replacement tool: %s.\n", mentorFullName, localWc.getReplacementTool());
        System.out.format("%s mentor step out after done, put back the %s to it's place like nothing happened, and whatch himself in the mirror.\n", mentorFullName, localWc.getReplacementTool());
        System.out.format("%s check himself if beauty enough for teaching.\n", mentorFullName);
        if (!localWc.getBeauty()){
            System.out.format("%s do some make up with his rose red lipstick.\n", mentorFullName);
            localWc.setBeauty();
            System.out.format("%s check himself again. Perfect!\n", mentorFullName);
        }
        System.out.format("%s exits from the toilet.\n", mentorFullName);
        System.out.format("%s student smells something wierd while eating... The stink level is over %d.\n", studentFullName, localWc.getStinkLevel());
        System.out.println("Stops eating.");
        if (!localKitchen.isClean()){
            System.out.format("%s mentor enters the kitchen and see the mess the %s student made!\n", mentorFullName, studentFullName);
            System.out.println("The mentor start to shout and force " + studentFullName + " to clean up.");
            localKitchen.doTheDirtyJob();
            localStudent.setEnergyLevel(5);
        }
        System.out.format("%s mentor see that the student energy level is at %d. That's critically low! Need an emergency operation!\n", mentorFullName, localStudent.getEnergyLevel());
        System.out.println("The mentor quickly bring out his compact emergency destillator from his backpack and a jar of fermented fruit. ");
        System.out.format("%s and %s jump out the window to make some booze. Unfortunately they can't go more far, because they can live without the wifi range more then 30 seconds, therefore they need a good hiding place close.\n", mentorFullName, studentFullName);
        Scanner newLocation = new Scanner(System.in);
        System.out.println("Enter a new place to hide: ");
        String locationInput = newLocation.nextLine();
        System.out.println("Enter what fire can be made at that place (from 1 to 10:)");
        int fireQuality = newLocation.nextInt();
        System.out.println("Enter how many ppl can see you at that place (from 0 to 3):");
        int visible = newLocation.nextInt();

        Yard localYard = new Yard();
        localYard.addNewLocation(locationInput, fireQuality, visible);
        System.out.println("They seek for a good location.");
        System.out.println("The available places are: ");
        HidingPlaces[] locations = localYard.getLocations();
        for(HidingPlaces item: locations){
            System.out.println("* " + item.name);
        }
    }

}
