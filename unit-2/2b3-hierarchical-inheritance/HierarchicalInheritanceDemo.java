// Base class
class Device {
    String brand;
    String model;

    void displayDeviceInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

// Derived class 1
class Smartphone extends Device {
    int cameraMegapixel;

    void displaySmartphoneInfo() {
        displayDeviceInfo();
        System.out.println("Camera: " + cameraMegapixel + " MP");
    }
}

// Derived class 2
class Laptop extends Device {
    int ramSize;

    void displayLaptopInfo() {
        displayDeviceInfo();
        System.out.println("RAM: " + ramSize + " GB");
    }
}

// Main class
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.brand = "Samsung";
        phone.model = "Galaxy S24";
        phone.cameraMegapixel = 108;
        phone.displaySmartphoneInfo();

        System.out.println();

        Laptop laptop = new Laptop();
        laptop.brand = "HP";
        laptop.model = "Pavilion 15";
        laptop.ramSize = 16;
        laptop.displayLaptopInfo();
    }
}
