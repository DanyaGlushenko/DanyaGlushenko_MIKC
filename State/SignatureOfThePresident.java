package main;
public class SignatureOfThePresident extends State {
    SignatureOfThePresident(Law law2) {
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
        System.out.print("Law moved to voting\n");
        law.changeState(new DiscussionAtASittingOfTheVerkhovnaRada(law));
    }

    @Override
    public void OnSignatureOfTheSpeakerOfTheVerkhovnaRada() {
        // TODO Auto-generated method stub
        System.out.print("You can't do that\n");
    }

    @Override
    public void OnSignatureOfThePresident() {
        // TODO Auto-generated method stub
        System.out.print("You are already in this state\n");
    }

    @Override
    public void OnPromulgation() {
        System.out.print("Law moved to promulgation\n");
        law.changeState(new Promulgation(law));

    }

    @Override
    public void OnRejection() {
        System.out.print("Law was rejected\n");
        law.changeState(new Rejection(law));

    }

}
