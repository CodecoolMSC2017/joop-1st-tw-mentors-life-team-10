package com.codecool;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Integer;
import java.io.*;

public class CodecoolClass {
    public String location;
    int year;
    Mentor[] mentors = new Mentor[0];
    Student[] students = new Student[0];
    private final int EXTEND_WITH_ONE = 1;
    private final int ONE_FOR_LAST_ITEM = 1;

    //public CodecoolClass(String location, int year, Mentor[] mentors, Student[] students){}

    public CodecoolClass(String location, int year, String mentorsCsvPath, String studentsCsvPath){
        this.location = location;
        this.year = year;

        //indexes
        final int FIRST_NAME = 0;
        final int LAST_NAME = 1;
        final int BIRTH_YEAR = 2;
        final int GENDER = 3;
        final int ENERGY_LEVEL = 4;        
        final int MENTOR_NICKNAME = 5;
        final int STUDENT_KNOWLEDGE = 5;
        
        try{
            File openMentor = new File(mentorsCsvPath);
            Scanner read = new Scanner(openMentor);
            while (read.hasNext()){
                
                String data = read.nextLine();
                String[] splittedData = data.split(",");
                int age = Integer.parseInt(splittedData[BIRTH_YEAR]);
                int energyLevel = Integer.parseInt(splittedData[ENERGY_LEVEL]);
                mentors = Arrays.copyOf(mentors, mentors.length + EXTEND_WITH_ONE);
                mentors[mentors.length - ONE_FOR_LAST_ITEM] = new Mentor(splittedData[FIRST_NAME],
                                                                         splittedData[LAST_NAME],
                                                                         age,
                                                                         splittedData[GENDER],
                                                                         energyLevel,
                                                                         splittedData[MENTOR_NICKNAME]);
                            
            }
            read.close();
        }
        catch (FileNotFoundException expt){
            System.out.println("Mentor file not found!");
        }        
    
        try {
            File openStudent = new File(studentsCsvPath);
            Scanner read = new Scanner(openStudent);
            while (read.hasNext()){
                String data = read.nextLine();
                String[] splittedData = data.split(",");
                int age = Integer.parseInt(splittedData[BIRTH_YEAR]);
                int energyLevel = Integer.parseInt(splittedData[ENERGY_LEVEL]);
                int knowledgeLevel = Integer.parseInt(splittedData[STUDENT_KNOWLEDGE]);
                students = Arrays.copyOf(students, students.length + EXTEND_WITH_ONE);
                students[students.length - ONE_FOR_LAST_ITEM] = new Student(splittedData[FIRST_NAME],
                                                                            splittedData[LAST_NAME],
                                                                            age,
                                                                            splittedData[GENDER],
                                                                            energyLevel,
                                                                            knowledgeLevel);
            }
            read.close();
        }
        catch (FileNotFoundException excp){
            System.out.println("Student.csv file not found");
        }        
    }
    
    public Student findStudentByFullName(String fullName){
        String[] studentName = fullName.split(" ");
        
        for(Student student: students){
            if (student.firstName.equals(studentName[0]) && student.lastName.equals(studentName[1])){
                return student;
            }
        }
        return null;
    }


    public Mentor findMentorByFullName(String fullName){
        String[] mentorName = fullName.split(" ");

        for(Mentor mentor: mentors){
            if (mentor.firstName.equals(mentorName[0]) && mentor.lastName.equals(mentorName[1])){
                return mentor;
            }           
        }
        return null;
    }


    public static void main(String[] args){
        CodecoolClass test = new CodecoolClass("miskolc", 2017, "../data/mentors.csv", "../data/students.csv");
        
        for (Student item: test.students){
            System.out.println(item.gender);
        }        
        
    }

}

