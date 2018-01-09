package com.codecool;

public class Wc{

    private boolean toiletPaper;
    private int stinkLevel;
    private boolean beauty;
    public String replacementTool;

    public Wc(String tool){
        replacementTool = tool;
        toiletPaper = false;
        stinkLevel = 0;
        beauty = false;
    }

    void setToiletPaper(){
        toiletPaper = true;
    }

    void setStinkLevel(int level){
        stinkLevel = level;
    }

    void setBeauty(){
        beauty = true;
    }

    boolean getToiletPaper(){
        return toiletPaper;
    }

    int getStinkLevel(){
        return stinkLevel;
    }

    boolean getBeauty(){
        return beauty;
    }

    String getReplacementTool(){
        return replacementTool;
    }
}
