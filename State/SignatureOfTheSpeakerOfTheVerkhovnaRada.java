package main;

public class SignatureOfTheSpeakerOfTheVerkhovnaRada extends State {

    SignatureOfTheSpeakerOfTheVerkhovnaRada(Law law2) {
        super(law2);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void OnLegislativeInitiative() {
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
        System.out.print("You can't do that\n");
    }

    @Override
    public void OnSignatureOfTheSpeakerOfTheVerkhovnaRada() {
        // TODO Auto-generated method stub
        System.out.print("You are already in this state\n");
    }

    @Override
    public void OnSignatureOfThePresident() {
        System.out.print("Law moved to signature of the president\n");
        law.changeState(new SignatureOfThePresident(law));

    }
    @Override
    public void OnPromulgation() {
        // TODO Auto-generated method stub
        System.out.print("Law moved to promulgation\n");
        law.changeState(new Promulgation(law));
    }
    @Override
    public void OnRejection() {
        // TODO Auto-generated method stub
        System.out.print("You can't do that\n");
    }

}
