package Functions;

public class functions {
    public static void main(String args[]){
        greet();

        sayHello("Mehul");//arguments

        int x=getNumber();
        System.out.println(x);

        System.out.println(multiply(9,4));



    }
    //no i/p no o/p
    static void greet(){
        System.out.println("Hello");
        return; //optional
    }

    //i/p,no o/p
    static  void sayHello(String name){//no. of parameters cn BE ANYTHING
        System.out.println("Hello "+name);
    }
    //no i/p, o/p
    static int getNumber(){
        return 10;
    }

    //i/p o/p
    static int multiply(int a,int b){
        return (a*b);
    }
}
