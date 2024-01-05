package main;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory;


        factory = new SlateFactory();
        CreateRealFactory(factory);
        factory = new MetalFactory();
        CreateRealFactory(factory);

    }

    public static void CreateRealFactory(AbstractFactory f) {
        Roofs roof;
        RoofWorkers worker;
        roof = f.createRoof();
        worker = f.createWorker();
        roof.info();
        worker.info();
    }

}
