package com.codecool;

public class HidingPlaces{

    public String name;
    public int fireQuality;
    public int visibility;

    HidingPlaces(String name, int fireQuality, int visibility){
        this.name = name;
        this.fireQuality = fireQuality;
        this.visibility = visibility;
    }

    int getFireQuality(){
        return fireQuality;
    }

    int getVisibility(){
        return visibility;
    }
}