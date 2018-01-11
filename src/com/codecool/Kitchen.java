package com.codecool;
import java.util.Random;

public class Kitchen{

    String[] food;
    String[] foodFrom;
    boolean clean;

    Kitchen(){
        food = new String[4];
        food[0] = "Raw fish";
        food[1] = "Rotten eggs";
        food[2] = "Barely dead pig";
        food[3] = "Half baked squirrel";

        foodFrom = new String[4];
        foodFrom[0] = "the dustbin.";
        foodFrom[1] = "the dark side of the refigrator.";
        foodFrom[2] = "under the table.";
        foodFrom[3] = "Lindi Imres secret food hide-out."

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
        int n = rand.nextInt(4) + 1;
        int m = rand.nextInt(4) + 1;
        System.out.println(food[n-1] + " from " + foodFrom[m-1]);
    }

}