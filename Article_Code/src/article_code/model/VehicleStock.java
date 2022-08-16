package article_code.model;

import java.util.ArrayList;
import java.util.List;

public class VehicleStock {

    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();
    private List<Vehicle> copyVehicleList = new ArrayList<Vehicle>();

    public void setStock(Vehicle vehicle) {

        this.vehicleList.add(vehicle);
    }

    public List<Vehicle> getStock() {
        for (Vehicle aux : vehicleList) {

            copyVehicleList.add(aux);
        }
        return this.copyVehicleList;
    }
}
