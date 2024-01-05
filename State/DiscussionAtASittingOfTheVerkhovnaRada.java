package main;

public class DiscussionAtASittingOfTheVerkhovnaRada extends State {

    DiscussionAtASittingOfTheVerkhovnaRada(Law law2) {
        super(law2);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void OnLegislativeInitiative() {
        System.out.print("You can't do that\n");

    }

    @Override
    public void OnConsiderationInTheProfileCommittee() {
        System.out.print("Law returned to consideration in the Profile Committee\n");
        law.changeState(new LegislativeInitiative(law));

    }

    @Override
    public void OnDiscussionAtASittingOfTheVerkhovnaRada() {
        System.out.print("You are already in this state\n");

    }

    @Override
    public void OnVote() {
        System.out.print("Law moved to voting\n");
        law.changeState(new Vote(law));

    }

    @Override
    public void OnSignatureOfTheSpeakerOfTheVerkhovnaRada() {
        // TODO Auto-generated method stub
        System.out.print("You can't do that\n");
    }

    @Override
    public void OnSignatureOfThePresident() {
        // TODO Auto-generated method stub
        System.out.print("You can't do that\n");
    }
    @Override
    public void OnPromulgation() {
        // TODO Auto-generated method stub
        System.out.print("You can't do that\n");
    }
    @Override
    public void OnRejection() {
        System.out.print("Law was rejected\n");
        law.changeState(new Rejection(law));
    }

}
