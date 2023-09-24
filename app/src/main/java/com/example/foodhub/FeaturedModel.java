package com.example.foodhub;

public class FeaturedModel {
    private String name;
    private String time;
    private String type;
    private int image;
    private String rate;

    public FeaturedModel(String name, String time, String type, int image, String rate) {

        this.name = name;
        this.time = time;
        this.type = type;
        this.image = image;
        this.rate = rate;
    }

    public String getName() {return name;}

    public String getTime() {return time;}

    public String getType() {return type;}

    public int getImage() {return image;}

    public String getRate() {return rate;}
}
