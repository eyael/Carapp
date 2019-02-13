package com.company;

public class Vehicle {
    private String accelerate;
    private String speed;
    private String move;


    public Vehicle() {
        System.out.println("The red Porsche is starting");
    }

    public String accelerate()
    {
        return "The red Porsche is accelerating";
    }

    public String speed() {
        return "The red Porsche is going 50 mph";

    } public String move() {
        return "The red Porsche is stopped";


    }
}

