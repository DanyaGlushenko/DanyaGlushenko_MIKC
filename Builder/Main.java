package main;

public class Main {

    public static void main(String[] args) {

        Person mike = new BuilderImpl("Bob","Builder",27).setEmail("example@email.com.ua").setPhoneNumber("9847629876").build();
        System.out.print(mike.toString());




    }

}
