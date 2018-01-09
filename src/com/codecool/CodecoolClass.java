package com.codecool;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Integer;
import java.nio.channels.FileLockInterruptionException;
import java.io.*;

public class CodecoolClass {
    public String location;
    int year;
    Mentor[] mentors = new Mentors[0];
    //Student[] students = new Student[0];
    private final int EXTEND_WITH_ONE = 1;
    private final int ONE_FOR_LAST_ITEM = 1;

    //public CodecoolClass(String location, int year, Mentor[] mentors, Student[] students){}

    public CodecoolClass(String location, int year, String mentorsCsvPath, String studentsCsvPath){
        this.location = location;
        this.year = year;
        try{
            File openMentor = new File(mentorsCsvPath);
            Scanner read = new Scanner(openMentor).useDelimiter(",");
            while (read.hasNext()){
                
                String data = read.nextLine();
                String[] tempArray = data.split(";");
                int age = Integer.parseInt(tempArray[2]);
                int energyLevel = Integer.parseInt(tempArray[4]);
                mentors = Arrays.copyOf(mentors, mentors.length + EXTEND_WITH_ONE);
                mentors[mentors.length - ONE_FOR_LAST_ITEM] = new Mentor(tempArray[0], tempArray[1], age, tempArray[3], energyLevel, tempArray[5]);
                System.out.format("%d %d %s\n", age, energyLevel, tempArray[0]);            
            }
            read.close();
        }
        catch (FileLockInterruptionException expt){
            System.out.println("No such file found");
        }

        
    }

    public static CodecoolClass createLocal(){

    }

    public static void main(String[] args){
        CodecoolClass test = new CodecoolClass("miskolc", 2017, "../../../data/mentors.csv", "../../../data/student.csv");
    }
}

