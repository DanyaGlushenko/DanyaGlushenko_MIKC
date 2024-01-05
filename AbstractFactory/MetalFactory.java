package main;

public class MetalFactory implements AbstractFactory{

    @Override
    public Roofs createRoof() {
        return new MetalSheetRoof();
    }

    @Override
    public RoofWorkers createWorker() {
        return new MetalSheetRoofWorker();
    }

}
