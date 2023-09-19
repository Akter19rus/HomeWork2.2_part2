public class ServiceStation implements ServiceStationInterface {
    @Override
    public void check(WheeledVehicles[] wheeledVehicles) {
        autoReportUpdateTyre(wheeledVehicles);

        }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine(Car car, Truck truck) {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer(Truck truck) {
        System.out.println("Проверяем прицеп");
    }

    public void autoReportUpdateTyre(WheeledVehicles[] wheeledVehicles) {
        int tyres = 0;
        for (WheeledVehicles i : wheeledVehicles) {
        }
            
        }
    }
}
