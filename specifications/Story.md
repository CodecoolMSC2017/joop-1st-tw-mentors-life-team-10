# Story

## Description

This file should contain the description of your team's story to tell about a mentor's life @ Codecool.

## import

`import java.util.Scanner`
`import java.util.Scanner;`
`import java.lang.Iterable;`
`import java.util.concurrent.TimeUnit;`

## Instrance field

Nothing to declare.

## Constructor

Default.

## Instance methods

### Public void wainting()

Pause the programm running with the given seconds.


## Reading data from file

    public class Story{ 

    public static void main(String[] args) {
        String mentorFullName = args[0];
        String studentFullName = args[1];

        // Mentors and students are initialized from CSV when createLocal is called
        CodecoolClass localClass = CodecoolClass.createLocal();

        Mentor localMentor = localClass.findMentorByFullName(mentorFullName);
        if (localMentor == null) {
            System.out.println("No mentor named " + mentorFullName + " was found");
            System.exit(1);
        }

        Student localStudent = localClass.findStudentByFullName(studentFullName);
        if (localStudent == null) {
            System.out.println("No student named " + studentFullName + " was found");
            System.exit(1);
        }

        System.out.println("Mentor " + mentorFullName + " was found, cool!");
        System.out.println("Student " + studentFullName + " was found, cool!");

### Story Chapter 1

        System.out.format("%s has entered to the Hangar and says Hi" , studentFullName);
        System.out.format("%s notice him and happily jumps to there as a bunny, then hug him", mentorFullName);
        System.out.format("%s mentor notice that %s student`s %d energy level. Taht`s too low!, mentorFullName, studentFullName, localStudent.getEnergyLevel());
        System.out.format("%s bring %s to the kitchen to feed him);

        Kitchen localKitchen = new Kitchen();

        // Call a function what does not return but print the result in place
        localKitchen.feedThePerson;

        System.out.format(%s mentor feels like he quickly have to use the toilet, so run out.", mentorFullName);
        Wc localWc = new Wc("towel");

        System.out.format(%s starts to eat like a pig.", studentFullName);
        localKitchen.eatLikeAPig();
        localStudent.setenergyLevel(100);
        
        System.out.format(%s hearing satisfied noises from the toilet, studentFullName);
        localWc.setStinkLevel(9000);
        
        System.out.format(%s mentor finished his act, and streching out for toilet paper..., mentorFullName);
        if (localWc.getToiletPaper()){
            System.out.format("%s mentor use the paper", mentorFullName);
        }
        else {
            System.out.format(%s mentor did not found a toilet paper, and start to search replacement obejct while swearing", mentorFullName);
        }
        System.out.format("%s mentor succesfull find a replacement tool %s", mentorFullName, localWc.getReplacementTool());

        System.out.format("%s mentor step out after done, put back the %s to it's place like nothing happened, and whatch himself in the mirror", mentorFullName, localWc.getReplacementTool());

        System.out.format(%s check himself if beauty enough for teaching", mentorFirstName);
        if (!localWc.getBeauty()){
            System.out.format("%s do some make up with his rose red lipstick", mentorFirstName);
            localWc.setBeauty();
            System.out.format("%s check himself again. Perfect!", mentorFirstName);
        }
        System.out.format("%s exits from the toilet", mentorFullName);
        System.out.format("%s student smells something wierd while eating... The stink level is over %d", studentFullName, localWc.getStinkLevel());
        System.out.println(Stops eating.)
        if (!localKitchen.isClean()){
            System.out.format("%s mentor enters the kitchen and see the mess the %s student made", mentorFullName, studentFullName);
            System.out.println(The mentor start to shout and force" + studentFullName + " to clean up);
            localKitchen.doTheDirtyJob()
            localStudent.setEnergyLevel(50);
        }
        System.out.format("%s mentor see that the student energy level is %d. That's critically low! Need an emergency operation!", mentorFullName, localStudent.getEnergyLevel());

        System.out.println("The mentor quickly bring out his compact emergency destillator from his backpack and a jar of fermented fruit").
        System.out.format("%s and %s jump out the window to the yard. Unfortunately they can't go more far, because they can live without the wifi range more then 30 seconds, therefore they need a good hiding place close", mentorFullName, studentFullName);
        
        Scanner newLocation = new Scanner(System.in);
        System.out.println("Enter a new place to hide: ");
        String locationInput = newLocation.nextLine();
        System.out.println("Enter what fire can be made at that place (from 1 to 10:)");
        int fireQuality = newLocation.nextInt();
        System.out.println("Enter how many ppl can see you at that place (from 0 to 3):");
        int visible = newLocation.nextInt();


        Yard localYard = new Yard();
        localYard.addNewLocation(locationInput, fireQuality, visible);
        System.out.println("They seek for a good location")
        Yard locations = getLocations();
        for(Yard item: locations){
            System.out.println("The available places are:" + item);
        }

        Scanner userChoice = new Scanner(system.in);
        System.out.println("plase enter the index of location you want to use: );
        int place = userChoice.nextInt();
        localYard.setUserChoice(place);

        boolean success = localYard.calculateResult();
        if (success){
            localStudent.setEnergyLevel(200);
            System.out.print("%s gained 12 gram of alchol. He is very happy now, also gained %d energy.", studentFullName, localStudent.getEnergyLevel());
        }
        else{
            System.out.println("Fail to make some drink, an ugly old lady called the police. You get 56345FT penalty.")
            localStudent.setEnergyLevel(0);
            System.out.format("%s student level dropped to %d. He is dead.", studentFullName, localStudent.getEnergyLevel());
        }
        










