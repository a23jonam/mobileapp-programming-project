package com.example.project;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("WeakerAccess")
public class RecyclerViewItem {


    @SerializedName("name")
    private String title;

    @SerializedName("company")
    private String creator;

    @SerializedName("location")
    private String difficulty;

    @SerializedName("category")
    private String type;

    @SerializedName("size")
    private int maxNumberOfPlayers;

    @SerializedName("cost")
    private int amountOfTime;

    /*@SerializedName("auxdata")
    private String colorPattern;*/

    public String getTitle() {
        return title;
    }
    public String getCreator() {
        return creator;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getType() {
        return type;
    }

    public int getMaxNumberOfPlayers() {
        return maxNumberOfPlayers;
    }

    public int getAmountOfTime() {
        return amountOfTime;
    }

    /*public String getColorPattern() {
        return colorPattern;
    }*/

    public RecyclerViewItem(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "" +
                "" + title +
                "\nSkapare: " + creator +
                "\nSvårighetsgrad: " + difficulty +
                "\nTyp: " + type +
                "\nMax antal spelare: " + maxNumberOfPlayers +
                "\nTid: " + amountOfTime;
                /*"\nFärg: " + colorPattern;*/
    }
}


