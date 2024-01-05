package main;

public class Law {
    private State state;
    Law(){
        this.state=new LegislativeInitiative(this);
    }
    Law(State a){
        this.state=a;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void printState() {
        System.out.print(getState().getClass().getSimpleName()+"\n");
    }

    public void ToVote() {
        state.OnVote();
    }

    public void ToProfileCommittee() {
        state.OnConsiderationInTheProfileCommittee();
    }

    public void ToVerkhovnaRada() {
        state.OnDiscussionAtASittingOfTheVerkhovnaRada();
    }

    public void ToSignatureVerkhovnaRada() {
        state.OnSignatureOfTheSpeakerOfTheVerkhovnaRada();
    }

    public void ToSignaturePresident() {
        state.OnSignatureOfThePresident();
    }

    public void ToPromulgation() {
        state.OnPromulgation();
    }

    public void ToRejection() {
        state.OnRejection();
    }


}
