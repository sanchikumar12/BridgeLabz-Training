package fleetmanagement;

class Vehicle {
    String vehicleId;
    int mileage; // lower mileage = earlier maintenance

    Vehicle(String vehicleId, int mileage) {
        this.vehicleId = vehicleId;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return vehicleId + " (Mileage: " + mileage + ")";
    }
}
