package main;

public class Vote extends State {

    Vote(Law law2) {
        super(law2);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void OnLegislativeInitiative() {
        // TODO Auto-generated method stub
        System.out.print("You can't do that\n");
    }

    @Override
    public void OnConsiderationInTheProfileCommittee() {
        // TODO Auto-generated method stub
        System.out.print("You can't do that\n");
    }

    @Override
    public void OnDiscussionAtASittingOfTheVerkhovnaRada() {
        // TODO Auto-generated method stub
        System.out.print("You can't do that\n");
    }

    @Override
    public void OnVote() {
        // TODO Auto-generated method stub
        System.out.print("You are already in this state\n");
    }

    @Override
    public void OnSignatureOfTheSpeakerOfTheVerkhovnaRada() {
        // TODO Auto-generated method stub
        System.out.print("Law moved to signature of the speaker of the Verkhovna Rad\n");
        law.changeState(new SignatureOfTheSpeakerOfTheVerkhovnaRada(law));
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
        // TODO Auto-generated method stub
        System.out.print("Law was rejected\n");
        law.changeState(new Rejection(law));
    }

}
