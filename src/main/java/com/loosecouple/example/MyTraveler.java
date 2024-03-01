package com.loosecouple.example;

public class MyTraveler {
    private Vehicle vehicle;

    public MyTraveler(){

    }
    public MyTraveler(Vehicle v){
        this.vehicle = v;
    }
    public void startJourney(){
        vehicle.move();
    }
}
