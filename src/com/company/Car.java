package com.company;

public class Car extends Vehicle{


    public Car () {
        System.out.println("The red Porsche is starting!");
    }
    public String accelerate1() {
        return "The red Porsche is accelerating";

    }   public String accelerate2(){
            return"The blue Jetta is accelerating";

        }

        public String emision() {
            return "The blue Jetta has stopped to have its emissions checked";

        }

        public String speed() {
        return "The red Porsche is going 50 mph";

    } public String move() {
            return "The red Porsche is stopped";

    }
}
