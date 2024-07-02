 abstract class Vehicle {
    String make;
    String model;
    String fueltype;
    int year;
    
    Vehicle(String m,String md,String ft,int y){
        this.make=m;
       this. model=md;
       this. fueltype=ft;
       this.year=y;
       

    }
    public abstract double fuelEfficiency();
    public abstract double distancetravelled(double d);
    public abstract double maxspeed();
    
    
}
 class Car extends Vehicle{
    double fueleff;
    double maxspeed;
    Car(String m,String md,String ft,int y, Double fe,Double ms){
        super(m,md,ft,y);
        this. fueleff=fe;
       this. maxspeed=ms;
    }
    public double fuelEfficiency(){
        return fueleff;
    }
   public  double maxspeed(){
        return maxspeed;
    }
    public double distancetravelled(double d){
        return d/fueleff;
    }
}
class Truck extends Vehicle{
    double fueleff;
    double maxspeed;
    Truck(String m,String md,String ft,int y, Double fe,Double ms){
        super(m,md,ft,y);
        this. fueleff=fe;
       this. maxspeed=ms;
    }
    public double fuelEfficiency(){
        return fueleff;
    }
   public  double maxspeed(){
        return maxspeed;
    }
    public double distancetravelled(double d){
        return d/fueleff;
    }
}
class Motorcycle extends Vehicle{
    double fueleff;
    double maxspeed;
    Motorcycle(String m,String md,String ft,int y, Double fe,Double ms){
        super(m,md,ft,y);
        this. fueleff=fe;
       this. maxspeed=ms;
    }
    public double fuelEfficiency(){
        return fueleff;
    }
   public  double maxspeed(){
        return maxspeed;
    }
    public double distancetravelled(double d){
        return d/fueleff;
    }
}
public class lab106{
    public static void main(String args[]){
        Truck truck = new Truck("Ford", "F150", "Gasoline",2020,  15.0, 120.0);
        Car car = new Car("Toyota", "Camry","Gasoline",2019, 25.0, 110.0);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", "Gasoline",2018,  30.0, 150.0);

        System.out.println("Truck fuel efficiency: " + truck.fuelEfficiency() + " mpg");
        System.out.println("Car fuel efficiency: " + car.fuelEfficiency() + " mpg");
        System.out.println("Motorcycle fuel efficiency: " + motorcycle.fuelEfficiency() + " mpg");

        double truckFuelConsumed = 60.0; // gallons
        double carFuelConsumed = 40.0; // gallons
        double motorcycleFuelConsumed = 20.0; // gallons

        System.out.println("Truck distance traveled: " + truck.distancetravelled(truckFuelConsumed) + " miles");
        System.out.println("Car distance traveled: " + car.distancetravelled(carFuelConsumed) + " miles");
        System.out.println("Motorcycle distance traveled: " + motorcycle.distancetravelled(motorcycleFuelConsumed) + " miles");

        System.out.println("Truck max speed: " + truck.maxspeed() + " mph");
        System.out.println("Car max speed: " + car.maxspeed() + " mph");
        System.out.println("Motorcycle max speed: " + motorcycle.maxspeed() + " mph");
    }
}