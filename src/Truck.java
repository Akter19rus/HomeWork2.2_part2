public  class Truck extends MotorTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void service() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkTrailer();
        checkEngine();
    }
}
