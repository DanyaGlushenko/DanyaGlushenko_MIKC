package main;

public abstract class State {
    Law law;
    State(Law law2) {
        this.law = law2;
    }

    public abstract void OnLegislativeInitiative(); //законодавча ініціатива 1
    public abstract void OnConsiderationInTheProfileCommittee(); //розгляд в профільному комітеті 2
    public abstract void OnDiscussionAtASittingOfTheVerkhovnaRada(); //обговорення на засіданні ВРУ 3
    public abstract void OnVote(); //винесений на голосування 4
    public abstract void OnSignatureOfTheSpeakerOfTheVerkhovnaRada(); //підпис спікера ВРУ 5
    public abstract void OnSignatureOfThePresident(); //підпис президента 6
    public abstract void OnPromulgation(); //оприлюднення 7
    public abstract void OnRejection();				//відхилення 8


}
