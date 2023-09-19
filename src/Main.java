public class Main {
    public static void main(String[] args) {
        WheeledVehicles[] wheeledVehicles = {
            new Car("Машина 1", 4),
            new Car("Машина 2", 4),

            new Truck("Грузовик 1", 6),
            new Truck("Грузовик 2", 8),

            new Bicycle("Велосипед 1", 2),
            new Bicycle("Велосипед 2", 2)
        };

        ServiceStationInterface station = new ServiceStation();
        System.out.println(station.check(wheeledVehicles));


    }
}