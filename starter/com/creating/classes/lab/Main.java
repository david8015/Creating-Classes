package com.creating.classes.lab;

public class Main {

    public static void main(String[] args) {

        //Instantiate new com.creating.classes.lab.Animal
        Animal dog = new Animal(4, 25, false,"woulfie" );

        String name;
        int topSpeed;

        //get name and speed values using getters
        name = dog.getName();
        topSpeed = dog.getTopSpeed();

        //Print some output
        System.out.println("Hello my name is " + name + " and i can run " + topSpeed + " MPH.");

        //Set new name, speed, and endangered properties values using setters
        dog.setTopSpeed(20);
        dog.setName("Teddy");
        dog.setEndangered(true);


        //get new values using getters
        name = dog.getName();
        topSpeed = dog.getTopSpeed();

        //Print some output
        System.out.println("My name is " + name + " and my top speed is " + topSpeed + " MPh.");
    }
}
