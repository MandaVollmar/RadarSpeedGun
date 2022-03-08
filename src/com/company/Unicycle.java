package com.company;

public class Unicycle extends NonMotorizedVehicles implements Mover {
    // properties of a Unicycle
    private String model;
    private boolean canRide;
    private int mph;

    public Unicycle(String type, int numOfWheels, double height, String model, boolean canRide, int mph) {
        super(type, numOfWheels, height);
        this.model = model;
        this.canRide = canRide;
        this.mph = mph;
    }

    public String getModel() {
        return model;
    }

    public boolean getCanRide() {
        return canRide;
    }

    public int getMph() {
        return mph;
    }

    //Methods for a Unicycle
    public void buildUnicycle() {
        super.buildNonMotorizedVehicle();
        System.out.println("This unicycle was made by " + model + "\n Can you ride it? " + canRide);
    }

    @Override
    public int move(int mph) {
        System.out.println("The unicycle is now moving at " + getMph() + " mph.");
        return mph;
    }
}
