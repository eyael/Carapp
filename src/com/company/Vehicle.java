package com.company;

public class Vehicle {
    private String accelerate1;
    private String accelerate2;
    private String emision;
    private String speed;
    private String move;



    public Vehicle() {
        System.out.println("The red Porsche is starting");
    }

    public String accelerate1() {
        return "The red Porsche is accelerating";

    }

    public String accelerate2(){
        return"The blue Jetta is accelerating";

}
    public String emision() {
        return "The blue Jetta has stopped to have its emissions checked ";

    }
    public String speed() {
        return "The red Porsche is going 50 mph";

    }

    public String getAccelerate1() {
        return accelerate1;
    }

    public String getAccelerate2() {
        return accelerate2;
    }

    public String getEmision() {
        return emision;
    }

    public void setEmision(String emision) {
        this.emision = emision;
    }

    public void setAccelerate2(String accelerate2) {
        this.accelerate2 = accelerate2;
    }

    public void setAccelerate(String accelerate) {
        this.accelerate1 = accelerate;

    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String move() {
        return "The red Porsche is stopped";


    }
}

