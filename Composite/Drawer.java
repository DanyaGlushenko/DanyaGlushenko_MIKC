package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Drawer extends Thing {	//тубма
    protected List<Thing> drawer = new ArrayList<>();
    public Drawer(int numberOfDrawerBoxes) {
        super.cost=15;
        super.buildCost=40;
        for(int i = 0; i< numberOfDrawerBoxes; i++) {
            drawer.add(new DrawerBox());
        }
    }


    @Override
    public int getTotalCost() {
        int a=0;
        for(int i = 0; i< drawer.size(); i++) {
            a+=drawer.get(i).getTotalCost();
        }

        return super.getTotalCost()+a;
    }

    @Override
    public String printCost() {
        String a="";
        for(int i = 0; i< drawer.size(); i++) {
            a+="\n" + drawer.get(i).printCost();
        }
        a = a.replace("\n", "\n\t");
        return super.printCost() + a + "\n";
    }


}
