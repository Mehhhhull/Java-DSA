package Abstraction;

public class abstraction {
    public static void main(String[] args){

        Car car=new FuelCar();
        car.start();
        car.accelerated();
        car.Break();


    }
}

abstract class Car{
    void start(){
        System.out.println("Car Started");
    }

    abstract void accelerated();

    abstract void Break();
}

class FuelCar extends Car{

    @Override
    void accelerated(){
        System.out.println("Fuel Car is Accelarating");
    }

    @Override
    void Break(){
        System.out.println("Fuel Car is stopping");
    }
}

class ElectricCar extends Car{

    @Override
    void accelerated(){
        System.out.println("Electric Car is Accelarating");
    }

    @Override
    void Break(){
        System.out.println("Electric Car is stopping");
    }
}