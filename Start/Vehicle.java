class Vehicle {
    void run() {
        System.out.println("Vehicle is Running");
    }

    class Bike extends Vehicle {
        void run() {
            System.out.println("Bike is Running");
        }
    }

    public static void main(String args[]) {
        Vehicle.Bike obj = new Vehicle().new Bike();
        obj.run();
    }
}
