package main;

public class CeramicFactory implements AbstractFactory {

    @Override
    public Roofs createRoof() {
        return new СeramicTileRoof();
    }

    @Override
    public RoofWorkers createWorker() {
        return new CeramicTileRoofWorker();
    }

}
