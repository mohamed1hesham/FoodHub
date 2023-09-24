package com.example.foodhub;

public class CategoryModel {
    private String catName;
    private int catImage;


    public CategoryModel(String catName, int catImage) {
        this.catName = catName;
        this.catImage = catImage;
    }

    public String getCatName() {
        return catName;
    }

    public int getCatImage() {
        return catImage;
    }
}
