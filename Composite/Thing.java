package main;

public class Thing implements ThingInterface {
    int cost;
    int buildCost;

    @Override
    public int getTotalCost() {
        return buildCost + cost;
    }

    @Override
    public String printCost() {
        return this.getClass().getSimpleName() + ": Part cost = " + cost + " Build cost = " + buildCost + "\n";
    }



}
