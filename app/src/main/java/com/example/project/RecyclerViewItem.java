package com.example.project;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("WeakerAccess")
public class RecyclerViewItem {


    @SerializedName("name")
    private String title;

    @SerializedName("company")
    private String orderOfFungi;

    @SerializedName("location")
    private String colorPattern;

    @SerializedName("category")
    private String culinaryStatus;

    @SerializedName("size")
    private int heightInCentimeters;

    @SerializedName("cost")
    private int widthInCentimeters;

    public RecyclerViewItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getOrderOfFungi() {
        return orderOfFungi;
    }

    public String getColorPattern() {
        return colorPattern;
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

    @Override
    public String toString() {
        return "RecyclerViewItem{" +
                "title='" + title + '\'' +
                ", orderOfFungi='" + orderOfFungi + '\'' +
                ", colorPattern='" + colorPattern + '\'' +
                ", culinaryStatus='" + culinaryStatus + '\'' +
                ", heightInCentimeters=" + heightInCentimeters +
                ", widthInCentimeters=" + widthInCentimeters +
                '}';
    }
}
