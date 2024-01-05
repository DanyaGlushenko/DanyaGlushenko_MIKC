package main;
public class Rejection extends State {
    Rejection(Law law2) {
        super(law2);
        // TODO Auto-generated constructor stub
    }
    void a() {
        System.out.print("Law is already rejected, cannot change state");
    }

    @Override
    public void OnLegislativeInitiative() {
        // TODO Auto-generated method stub
        a();
    }

    @Override
    public void OnConsiderationInTheProfileCommittee() {
        // TODO Auto-generated method stub
        a();
    }

    @Override
    public void OnDiscussionAtASittingOfTheVerkhovnaRada() {
        // TODO Auto-generated method stub
        a();
    }

    @Override
    public void OnVote() {
        // TODO Auto-generated method stub
        a();
    }

    @Override
    public void OnSignatureOfTheSpeakerOfTheVerkhovnaRada() {
        // TODO Auto-generated method stub
        a();
    }

    @Override
    public void OnSignatureOfThePresident() {
        // TODO Auto-generated method stub
        a();
    }

    @Override
    public void OnPromulgation() {
        // TODO Auto-generated method stub
        a();
    }

    @Override
    public void OnRejection() {
        // TODO Auto-generated method stub
        a();
    }

}