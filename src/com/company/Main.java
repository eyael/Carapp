package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle a = new Vehicle();
        print(a.accelerate1());
        print (a.accelerate2());
        print(a.emision());
        print(a.speed());
        print(a.move());



    }

        private static void print(String a){
            System.out.println(a );


        }
    }

