package oops;

public class autoboxingNunboxing {
    public static void main(String[] args){
//        //Autoboxing
//        int x=10;
//        Integer y=x;
//
//        System.out.println(x);
//        System.out.println(y);
//
//        //Unboxing
//        Integer a=20;
//        int b=a;
//
//        System.out.println(a);
//        System.out.println(b);

        Integer x=500;
        printInteger(x);

        Integer z=null;
        int m=z; //it will give nullPointerException
    }
    static void printInteger(int x){
        System.out.println(x);
    }


}

//when autoboxing and unboxing is applied
//1)Assignments
//2)Method Calls
//3)Arithmetic Sum
