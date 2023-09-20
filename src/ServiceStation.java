public class ServiceStation {
    public void check(WheeledVehicles wheeledVehicles) {
        if (wheeledVehicles instanceof Car) {
            System.out.println("Обслуживаем " + wheeledVehicles.getModelName());
            wheeledVehicles.service();

        } else if (wheeledVehicles instanceof Truck) {
            System.out.println("Обслуживаем " + wheeledVehicles.getModelName());
            wheeledVehicles.service();


        } else if (wheeledVehicles instanceof Bicycle) {
            System.out.println("Обслуживаем " + wheeledVehicles.getModelName());
            wheeledVehicles.service();
        }
    }
}