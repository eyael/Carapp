package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle a = new Vehicle();
        print(a.accelerate());
        print(a.speed());
        print(a.move());


    }

        private static void print(String a){
            System.out.println(a );


        }
    }

