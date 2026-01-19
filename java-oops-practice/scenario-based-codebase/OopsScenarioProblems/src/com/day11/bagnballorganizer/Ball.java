package com.day11.bagnballorganizer;

public class Ball implements Storable {

    private String id;
    private String color;
    private String size;

    public Ball(String id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public String getDetails() {
        return "Ball ID: " + id + " Color: " + color + " Size: " + size;
    }
}


