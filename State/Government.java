package main;

public class Government {

    public void init() {
        Law firstLaw = new Law();
        System.out.println("1) Printing current state:");
        firstLaw.printState();
        System.out.println("Trying to perform a state change that is not allowed:");
        firstLaw.ToVote();
        System.out.println("Printing current state:");
        firstLaw.printState();
        System.out.println("2) Moving the law to the next step");
        firstLaw.ToProfileCommittee();
        System.out.println("Printing current state:");
        firstLaw.printState();
        System.out.println("3) Moving the law to the next step");
        firstLaw.ToVerkhovnaRada();
        System.out.println("Printing current state:");
        firstLaw.printState();
        System.out.println("4) Moving the law to the next step");
        firstLaw.ToVote();
        System.out.println("Printing current state:");
        firstLaw.printState();
        System.out.println("5) Moving the law to the next step");
        firstLaw.ToSignatureVerkhovnaRada();
        System.out.println("Printing current state:");
        firstLaw.printState();
        System.out.println("6) Moving the law to the next step");
        firstLaw.ToSignaturePresident();
        System.out.println("Printing current state:");
        firstLaw.printState();
        System.out.println("7) Moving the law to the next step");
        firstLaw.ToPromulgation();
        System.out.println("Printing current state:");
        firstLaw.printState();
    }
}
