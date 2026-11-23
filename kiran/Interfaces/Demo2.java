package kiran.Interfaces;

public class Demo2 {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.honk();
        vehicle.stop();

        Vehicle.display();
    }
}

interface Vehicle {
    void start();
    void stop();

    default void honk(){
        System.out.println("Honking the horn");
    }

    static void display(){
        System.out.println("This is a static method in the interface");
    }
}

class Car implements Vehicle {

    @Override
    public void start(){
        System.out.println("Car is starting");
    }

    @Override
    public void stop(){
        System.out.println("Car is stopping");
    }
}
