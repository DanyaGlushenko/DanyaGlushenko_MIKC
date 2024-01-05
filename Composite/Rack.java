package main;

import java.util.ArrayList;
import java.util.List;

public class Rack extends Thing {
    protected List<Thing> rack = new ArrayList<>();
    public Rack(int numberOfShelves, int numberOfDrawerBoxes) {
        super.cost=35;
        super.buildCost=45;
        rack.add(new Drawer(numberOfDrawerBoxes));
        for(int i = 0; i< numberOfShelves; i++) {
            rack.add(new Shelf());
        }

    }

    @Override
    public int getTotalCost() {
        int a=0;
        for(int i = 0; i< rack.size(); i++) {
            a+=rack.get(i).getTotalCost();
        }

        return super.getTotalCost()+a;
    }
    @Override
    public String printCost() {
        String a="";
        for(int i = 0; i< rack.size(); i++) {
            a+="\n" + rack.get(i).printCost();
        }
        a = a.replace("\n", "\n\t");
        return super.printCost() + a + "\n";
    }

}
