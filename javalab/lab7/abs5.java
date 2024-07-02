abstract class Vehicle {
    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle {
    public Car(String model) {
        super(model);
    }

    @Override
    public void startEngine() {
        System.out.println(model + " car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println(model + " car engine stopped.");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String model) {
        super(model);
    }

    @Override
    public void startEngine() {
        System.out.println(model + " motorcycle engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println(model + " motorcycle engine stopped.");
    }
}

public class abs5 {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        car.startEngine();
        car.stopEngine();

        Vehicle motorcycle = new Motorcycle("Yamaha");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
