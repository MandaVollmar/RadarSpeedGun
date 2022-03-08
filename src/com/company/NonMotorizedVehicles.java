package com.company;

public class NonMotorizedVehicles extends RadarSpeedGun{
    // properties of Non Motorized Vehicles
    String type;
    int numOfWheels;
    double height;

    public NonMotorizedVehicles(String type, int numOfWheels, double height){
        this.type =type;
        this.numOfWheels =numOfWheels;
        this.height=height;
    }

    public String getType() {
        return type;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public double getHeight() {
        return height;
    }
    //Methods for Non Motorized Vehicles
    public void buildNonMotorizedVehicle (){
        System.out.println("This vehicle is a " +type + " with " +numOfWheels+ " wheels. It stands "+height+ " inches tall.");
    }
}
