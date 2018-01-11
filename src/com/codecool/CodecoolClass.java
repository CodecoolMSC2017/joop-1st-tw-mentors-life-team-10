package com.codecool;

import java.util.Scanner;

import java.util.Arrays;
import java.lang.Integer;
import java.io.*;

public class CodecoolClass {
    public String location;
    int year;
    Mentor[] mentors;
    Student[] students;

    public CodecoolClass(String location, int year, Mentor[] mentors, Student[] students){
        this.location = location;
        this.year = year;
        this.mentors = mentors;
        this.students = students;
    }

    public CodecoolClass(String location, int year, String mentorsCsvPath, String studentsCsvPath){
        this.location = location;
        this.year = year;
        this.mentors = (Mentor[])readFile(mentorsCsvPath);
        this.students = (Student[])readFile(studentsCsvPath);         
    }

    
    public Student findStudentByFullName(String fullName){
        final int TWO = 2;
        final int FIRST_NAME = 0;
        final int LAST_NAME = 1;
        String[] studentName = fullName.split(" ");

        if (studentName.length != TWO){
            System.out.println("Invalid student name format! Type like this: 'firstname lastname'");
            return null;
        }  
        
        for(Student student: students){
            if (student.firstName.equals(studentName[FIRST_NAME]) && student.lastName.equals(studentName[LAST_NAME])){
                return student;
            }
        }
        return null;
    }


    public Mentor findMentorByFullName(String fullName){
        final int TWO = 2;
        final int FIRST_NAME = 0;
        final int LAST_NAME = 1;
        String[] mentorName = fullName.split(" ");   

        if (mentorName.length != TWO){
            System.out.println("Invalid mentor name format! Type like this: 'firstname lastname'");
            return null;
        }
        for(Mentor mentor: mentors){
            if (mentor.firstName.equals(mentorName[FIRST_NAME]) && mentor.lastName.equals(mentorName[LAST_NAME])){
                return mentor;
            }           
        }
        return null;
    }


    public Person[] readFile(String fileCsvPath){
        Student[] stud = new Student[0];
        Mentor[] ment = new Mentor[0];
        boolean isFileMentors = false;

        //indexes
        final int FIRST_NAME = 0;
        final int LAST_NAME = 1;
        final int BIRTH_YEAR = 2;
        final int GENDER = 3;
        final int ENERGY_LEVEL = 4;        
        final int MENTOR_NICKNAME = 5;
        final int STUDENT_KNOWLEDGE = 5;
        final int EXTEND_WITH_ONE = 1;
        final int ONE_FOR_LAST_ITEM = 1;
        
        try{
            File openFile = new File(fileCsvPath);
            Scanner read = new Scanner(openFile);
            while (read.hasNext()){                
                String data = read.nextLine();
                String[] splittedData = data.split(",");
                int age = Integer.parseInt(splittedData[BIRTH_YEAR]);
                int energyLevel = Integer.parseInt(splittedData[ENERGY_LEVEL]);

                if (fileCsvPath.contains("mentors.csv")){
                    isFileMentors = true;
                    ment = Arrays.copyOf(ment, ment.length + EXTEND_WITH_ONE);
                    ment[ment.length - ONE_FOR_LAST_ITEM] = new Mentor(splittedData[FIRST_NAME],
                                                                       splittedData[LAST_NAME],
                                                                       age,
                                                                       splittedData[GENDER],
                                                                       energyLevel,
                                                                       splittedData[MENTOR_NICKNAME]); 
                }
                else if (fileCsvPath.contains("students.csv")){ 
                    int knowledgeLevel = Integer.parseInt(splittedData[STUDENT_KNOWLEDGE]);

                    stud = Arrays.copyOf(stud, stud.length + EXTEND_WITH_ONE);
                    stud[stud.length - ONE_FOR_LAST_ITEM] = new Student(splittedData[FIRST_NAME],
                                                                        splittedData[LAST_NAME],
                                                                        age,
                                                                        splittedData[GENDER],
                                                                        energyLevel,
                                                                        knowledgeLevel);
                }
                else {
                    System.out.println("Wrong filename");
                }          
            }
            read.close();
        }
        catch (FileNotFoundException expt){
            System.out.println("File not found or cannot be read!");
            System.exit(1);
        }  
       

        if (isFileMentors){            
            return ment;            
        }
        else {
            return stud;
        }
    }


    public static CodecoolClass createLocal(){
        final String MENTOR_FILE = "../data/mentors.csv";
        final String STUDENT_FILE = "../data/students.csv";
        boolean useFirstConstructor = false;

        if (useFirstConstructor){ 
            Mentor[] nullMentor = new Mentor[0];
            Student[] nullStudent = new Student[0];
            CodecoolClass newClassroom = new CodecoolClass("Miskolc", 2017, nullMentor, nullStudent);        
            Student[] initialStudent = (Student[])newClassroom.readFile(STUDENT_FILE);
            Mentor[] initialMentor = (Mentor[])newClassroom.readFile(MENTOR_FILE); 
            CodecoolClass withFirstConstr = new CodecoolClass("Miskolc", 2017, initialMentor, initialStudent);
            return withFirstConstr;
        }
        else {
            CodecoolClass withSecondConstr = new CodecoolClass("miskolc", 2017, MENTOR_FILE, STUDENT_FILE);
            return withSecondConstr;
        }
    }



    // sample for the Stroy.java file later!
    public static void main(String[] args){
       
        CodecoolClass test = createLocal();
        System.out.println("test createlocal " + test.location);
        
        
        if (args.length == 2){
            if (test.findMentorByFullName(args[0]) != null){
                Mentor nameTest = test.findMentorByFullName(args[0]);
                System.out.println("mentor found:" + nameTest.firstName);
            }
            
            if (test.findStudentByFullName(args[1]) != null){
                Student nTest = test.findStudentByFullName(args[1]);                
                System.out.println("student found: " + nTest.lastName);
            }
            else {
                System.out.println("name not found");
            }
        }
        else {
            System.out.println("Error: 2 input argument is needed!");
        }
        
    }

}

