package Abstraction;

public class staticandfinalinpolymor {
    public static void main(String[] args){
        A a=new B();
       // a.fun();//hello will be run and it wont be override in static
        a.getX();//this will be override
        //methods participate in override
    }
}
//final ->class???->u cant create child of it


//static keyword->they belong to class and not to class
//private methods cant be overriden
//final methods cant be overidden

//Fields/Variables they cannot be polymorphir


//class A{
//    static void fun(){
//        System.out.println("Hello");
//    }
//    private void fun2(){
//        System.out.println("Hello");
//    }
//
//    final void fun3(){
//        System.out.println("Hello");
//    }
//}
//
//class B extends A{
//    static void fun(){
//        System.out.println("Bye");
//    }
//}
//

class A{
    int getX(){
        return 10;
    }
}

class B extends A{
    int get(){
        return 20;
    }
}
