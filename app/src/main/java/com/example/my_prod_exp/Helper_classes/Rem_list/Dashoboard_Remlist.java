package com.example.my_prod_exp.Helper_classes.Rem_list;

public class Dashoboard_Remlist {

    int image;
    String title,duration;

    public Dashoboard_Remlist(int image, String title, String duration) {
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
