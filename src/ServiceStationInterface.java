public interface ServiceStationInterface {
    void check(WheeledVehicles[] wheeledVehicles);

    void updateTyre();

    void checkEngine(Car car, Truck truck);

    void checkTrailer(Truck truck);
}
