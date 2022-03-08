package com.company;

public class Rabbit extends Animal implements Mover {
    // properties of a rabbit
    private String furColor;
    private boolean isPottyTrained;
    private int mph;

    //Methods for a rabbit
    public Rabbit(String name, String type, String furColor, boolean isPottyTrained, int mph) {
        super(name, type);
        this.furColor = furColor;
        this.isPottyTrained = isPottyTrained;
        this.mph = mph;
    }

    public String getFurColor() {
        return furColor;
    }

    public boolean getIsPottyTrained() {
        return isPottyTrained;
    }

    public int getMph() {
        return mph;
    }

    public void buildRabbit() {
        System.out.println("This rabbit has " + furColor + "fur. \n Have they been litterbox trained? "
                + isPottyTrained);
    }

    @Override
    public int move(int mph) {
        System.out.println(getName() +" is now moving at " + getMph() + " mph.");
        return mph;

    }
}
