package com.example.foodhub;

public class popularModel {
    private String popName;
    private String popDesc;
    private String popPrice;
    private int popImg;


    public popularModel(String popName,String popDesc,String popPrice, int popImg) {

        this.popName = popName;
        this.popDesc = popDesc;
        this.popPrice = popPrice;
        this.popImg = popImg;
    }

    public String getPopName() {
        return popName;
    }
    public String getPopDesc() {
        return popDesc;
    }
    public String getPopPrice() {return popPrice;}
    public int getPopImage() {
        return popImg;
    }
}
