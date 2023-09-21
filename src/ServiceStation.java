public class ServiceStation {
    public void check(WheeledVehicles wheeledVehicles) {
            System.out.println("Обслуживаем " + wheeledVehicles.getModelName());
            wheeledVehicles.service();
    }
}