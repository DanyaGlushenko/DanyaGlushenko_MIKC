package main;

public class App {


    public static void main(String[] args) {


        Closet a = new Closet(new Drawer(4));

        a.add(new DrawerBox());
        System.out.print(a.printCost());
        System.out.print("\nTotal cost = "+a.getTotalCost()+"\n\n");

        a.add(new Rack(2,2));
        System.out.print(a.printCost());
        System.out.print("\nTotal cost = "+a.getTotalCost()+"\n\n");


    }

}
