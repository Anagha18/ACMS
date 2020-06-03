package com.example.take1;

public class Dashboard_Remlist {

    int image;
    String title,duration;

    public Dashboard_Remlist(int image, String title, String duration) {
        this.image = image;
        this.title = title;
        this.duration = duration;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }
}