package com.codecool;
import java.util.Random;

public class Kitchen{

    String[] food;
    String[] foodFrom;
    boolean clean;

    Kitchen(){
        food = new String[3];
        food[0] = "raw fish";
        food[1] = "rotten eggs";
        food[2] = "barely dead pig";

        foodFrom = new String[3];
        foodFrom[0] = "dustbin";
        foodFrom[1] = "depths of the refigrator";
        foodFrom[2] = "under the table";

        clean = true;
    }

    boolean isClean(){
        return clean;
    }

    void eatLikeAPig(){
        clean = false;
    }

    void doTheDirtyJob(){
        clean = true;
    }

    void feedThePerson(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;
        int m = rand.nextInt(3) + 1;
        System.out.println(food[n-1] + " from " + foodFrom[m-1]);
    }

    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.feedThePerson();
    } 
}