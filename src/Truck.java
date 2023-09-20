public  class Truck extends WheeledVehicles {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkTrailer();
        checkEngine();
    }
}
