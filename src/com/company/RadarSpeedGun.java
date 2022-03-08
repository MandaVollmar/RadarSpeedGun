package com.company;

import java.util.ArrayList;
import java.util.List;

public class RadarSpeedGun{
    // Create property list of moving things
    private int totalSpeed;
    List<Mover> movingThings = new ArrayList();

    public int getTotalSpeed() {
        return totalSpeed;
    }

    //make a method to start all objects moving and calculates
    // a total speed of all the moving things
    public int startMotion(int totalSpeed) {
        this.totalSpeed= totalSpeed;
        System.out.println("The total speed of all moving objects is "+totalSpeed);
        return totalSpeed;

    }
}
