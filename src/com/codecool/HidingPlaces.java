package com.codecool;

public class HidingPlaces{

    public String name;
    private int fireQuality;
    private int visibility;

    HidingPlaces(String name, int fireQuality, int visibility){
        this.name = name;
        this.fireQuality = fireQuality;
        this.visibility = visibility;
    }

    public int getFireQuality(){
        return fireQuality;
    }

    public int getVisibility(){
        return visibility;
    }
}