package com.netsky.zerozapp.model;

/**
 * Created by zyxins on 2017-03-04.
 */

public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name,int imageId) {
        this.imageId = imageId;
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
