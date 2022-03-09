package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        RadarSpeedGun gun = new RadarSpeedGun(0);
        Rabbit rodger = new Rabbit("Rodger", "Holland Lop","brown",true,35);
        Unicycle myUni = new Unicycle("Unicycle",1,20,"Lither",false, 25);

        List<Mover> movingThings = new ArrayList();
        gun.startMotion(rodger);
        gun.startMotion(myUni);
        System.out.println("The total speed of all moving objects is " + gun.getTotalSpeed());
    }

}
