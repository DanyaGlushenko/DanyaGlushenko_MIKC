package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Closet extends Thing{	//шафа

    protected List<Thing> parts = new ArrayList<>();

    public Closet(Thing... components) {
        add(components);
    }

    public void add(Thing component) {
        parts.add(component);
    }

    public void add(Thing... components) {
        parts.addAll(Arrays.asList(components));
    }

    @Override
    public int getTotalCost() {
        int a=0;
        for(int i =0; i<parts.size();i++) {
            a+=parts.get(i).getTotalCost();
        }
        return a;
    }
    @Override
    public String printCost() {
        String a = "";
        for(int i =0; i<parts.size();i++) {
            a+=parts.get(i).printCost();
        }
        return a;
    }
}
