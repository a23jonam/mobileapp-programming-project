package com.example.project;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("WeakerAccess")
public class RecyclerViewItem {


    @SerializedName("name")
    private String title;

    @SerializedName("company")
    private String scientificName;

    @SerializedName("location")
    private String orderOfFungi;

    @SerializedName("category")
    private String culinaryStatus;

    @SerializedName("size")
    private int heightInCentimeters;

    @SerializedName("cost")
    private int widthInCentimeters;

    @SerializedName("auxdata")
    private String colorPattern;

    public String getTitle() {
        return title;
    }
    public String getScientificName() {
        return scientificName;
    }

    public String getOrderOfFungi() {
        return orderOfFungi;
    }

    public String getCulinaryStatus() {
        return culinaryStatus;
    }

    public int getHeightInCentimeters() {
        return heightInCentimeters;
    }

    public int getWidthInCentimeters() {
        return widthInCentimeters;
    }

    public String getColorPattern() {
        return colorPattern;
    }

    public RecyclerViewItem(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "" +
                "" + title +
                "\nVetenskapligt namn: " + scientificName +
                "\nOrdning: " + orderOfFungi +
                "\n" + culinaryStatus +
                "\nHöjd i cm: ~" + heightInCentimeters +
                "\nBredd i cm: ~" + widthInCentimeters +
                "\nFärg: " + colorPattern;
    }
}


