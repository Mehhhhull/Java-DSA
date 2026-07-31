package Functions;

public class functionOverloading {
    public static void main(String[] args){
        System.out.println();
    }
    /*
    This is function overloading,different func can have same func name,or their parament is different type,or diff number
     */
    static int sum(int a,int b){
        return (a+b);
    }
    static int sum(int a,int b,int c){//diff number of parameters
        return (a+b+c);
    }
    static int sum(double a,double b){ //diff type of parameters
        return (int)(a+b);
    }

    static void greet(String name,int age){
        System.out.println("Hi" +name +". your age is "+age);
    }

    static void greet(int age,String name){
        System.out.println("Hi" +name +". your age is "+age);
    }



}
