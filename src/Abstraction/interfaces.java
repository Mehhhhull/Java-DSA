package Abstraction;

public class interfaces {
    public static void main(String[] args){
        car Car=new ElectricCar1();
        Car.start();
        Car.accelerated();
        Car.Break();
    }
}

interface car{
    void start();

    void accelerated();

    void Break();
}

class FuelCar1 implements car{

    @Override
    public void start(){
        System.out.println("Fuel Car is Started");
    }
    @Override
    public void accelerated(){
        System.out.println("Fuel Car is Accelarating");
    }

    @Override
    public void Break(){
        System.out.println("Fuel Car is stopping");
    }
}

class ElectricCar1 implements car{

    @Override
    public void start(){
        System.out.println("Electric Car is Started");
    }

    @Override
    public void accelerated(){
        System.out.println("Electric Car is Accelarating");
    }

    @Override
    public void Break(){
        System.out.println("Electric Car is stopping");
    }
}
