package main;

public class SlateFactory implements AbstractFactory {

    @Override
    public Roofs createRoof() {
        return new SlateRoof();
    }

    @Override
    public RoofWorkers createWorker() {
        return new SlateRoofWorker();
    }

}
