package main;
public class ConsiderationInTheProfileCommittee extends State {

    ConsiderationInTheProfileCommittee(Law law2) {
        super(law2);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void OnLegislativeInitiative() {
        System.out.print("Law returned to legislative initiative\n");
        law.changeState(new LegislativeInitiative(law));

    }

    @Override
    public void OnConsiderationInTheProfileCommittee() {
        System.out.print("You are already in this state\n");
    }

    @Override
    public void OnDiscussionAtASittingOfTheVerkhovnaRada() {
        System.out.print("Law moved to discussion at a sitting of the Verkhovna Rada\n");
        law.changeState(new DiscussionAtASittingOfTheVerkhovnaRada(law));

    }

    @Override
    public void OnVote() {
        System.out.print("You can't do that\n");

    }

    @Override
    public void OnSignatureOfTheSpeakerOfTheVerkhovnaRada() {
        System.out.print("You can't do that\n");

    }

    @Override
    public void OnSignatureOfThePresident() {
        System.out.print("You can't do that\n");

    }

    @Override
    public void OnPromulgation() {
        System.out.print("You can't do that\n");

    }

    @Override
    public void OnRejection() {
        System.out.print("Law was rejected\n");
        law.changeState(new Rejection(law));
    }

}
