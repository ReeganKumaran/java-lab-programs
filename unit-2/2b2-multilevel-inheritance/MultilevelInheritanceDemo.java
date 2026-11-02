// Base class
class Vehicle {
    String brand;
    String type;

    void displayVehicleInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
    }
}

// Derived class from Vehicle
class Car extends Vehicle {
    int speed;
    int numberOfDoors;
    String fuelType;

    void displayCarInfo() {
        System.out.println("Top Speed: " + speed + " km/h");
        System.out.println("Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Derived class from Car (multilevel inheritance)
class ElectricCar extends Car {
    int batteryCapacity;
    int range;
    boolean fastCharging;

    void displayElectricCarInfo() {
        displayVehicleInfo();
        displayCarInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Range: " + range + " km");
        System.out.println("Fast Charging: " + (fastCharging ? "Yes" : "No"));
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.brand = "Tesla";
        ec.type = "Sedan";
        ec.speed = 250;
        ec.numberOfDoors = 4;
        ec.fuelType = "Electric";
        ec.batteryCapacity = 100;
        ec.range = 500;
        ec.fastCharging = true;
        ec.displayElectricCarInfo();
    }
}
