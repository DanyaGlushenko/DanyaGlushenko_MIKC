package main;

public interface AbstractFactory {
    Roofs createRoof();
    RoofWorkers createWorker();
}
