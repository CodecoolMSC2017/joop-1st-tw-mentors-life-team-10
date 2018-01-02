# ExampleStory

Here's my little example story. Compiling and running the below file (after implementing these functions of course) we can run it like

```
cd <repo>
cd src
javac com/codecool/ExampleStory.java
java com.codecool.ExampleStory "Imre Lindi" "Szántiágó Orvogán"
```

The program could output something like this

```
Codecool class at Miskolc in the year 2017 was created with 3 mentors and 42 students
Mentor Imre Lindi was found, cool!
Student Szántiágó Orgován was found, cool!
Let's take a look at our participants' energy levels!
Energy level of Imre is 59
Energy level of Szántiágó is 65
Energy level of the class is 234
Szántiágó jumps on the back of Imi and they start running around in the Hangár!
Let's see how did our participants' energy levels change after this little show!
Energy level of Imre is 49
Energy level of Szántiágó is 85
Energy level of the class is 244
```

_src/com/codecool/ExampleStory.java_
```
package com.codecool;

public class ExampleStory {

    public static void main(String[] args) {
        String mentorFullName = args[0];
        String studentFullName = args[1];

        // Mentors and students are initialized from CSV when createLocal is called
        CodecoolClass localClass = CodecoolClass.createLocal();

        // Display some info about the class
        localClass.displayStats();

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

        System.out.println("Let's take a look at our participants' energy levels!");

        System.out.format("Energy level of %s is %s\n", localMentor.getFirstName(), localMentor.getEnergyLevel());
        System.out.format("Energy level of %s is %s\n", localStudent.getFirstName(), localStudent.getEnergyLevel());
        System.out.format("Energy level of the class is %s\n", localClass.getOverallEnergyLevel();

        localMentor.givePiggyBackRideTo(localStudent);

        System.out.format("%s jumps on the back of %s and they start running around in the Hangár!\n",
            localStudent.getFirstName(),
            localMentor.getNickname());

        System.out.println("Let's see how did our participants' energy levels change after this little show!");

        System.out.format("Energy level of %s is %s\n", localMentor.getEnergyLevel());
        System.out.format("Energy level of %s is %s\n", localStudent.getEnergyLevel());
        System.out.format("Energy level of the class is %s\n", localClass.getOverallEnergyLevel();
    }
}

```
