package Abstraction;

public class concepts {
    public static void main(String[] args){
        Animals a=new Dog("Bruno");
        a.makeSound();
    }
}

abstract class Animals{
    String name;
    abstract void makeSound();

    Animals(String name){
        this.name=name;
    }

    void sleep(){
        System.out.println("Sleeping");
    }
}


class Dog extends Animals{

    Dog(String name){
        super(name);
    }
    @Override
    void makeSound(){
        System.out.println("Making barking sound");
    }
}

//Abstract Classes
//1)Can not be instantiated directly
//2)Can contain abstract method (method without implementations)
//3)Can also contain normal methods
//4)Is meant to be extended


//QUestions?
//CAn abstract classes have constructor?->Yes it is allowed
//Can abstract classes made final?->No, obv. Abstract meaning is that it is inherited
//Can abstract class have static methods?->Yess
//Can abstract method have private method?->Yes, but the private method cant be abstract. those hv to be non abstract
//Can it have final method? ->Yes. But non-abstract .
//can abstract class have no abstract method? ->Yesssssssssssssss
