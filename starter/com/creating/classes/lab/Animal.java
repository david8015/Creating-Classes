package com.creating.classes.lab;

public class Animal {
    private int numLegs;
    private int topSpeed;
    private boolean isEndangered;
    private String name;

    public Animal(int numLegs, int topSpeed, boolean isEndangered, String name){
       this.numLegs = numLegs;
       this.topSpeed = topSpeed;
       this.isEndangered = isEndangered;
       this.name = name;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public String getName() {
        return name;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setEndangered(boolean endangered) {
        this.isEndangered = endangered;
    }

    public void setName(String name) {
      this.name = name;
    }
}
