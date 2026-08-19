package oops;

public class nestedClass {
    public static void main(String[] args){
        Outer outer=new Outer();
        Outer.Inner inner=new Outer.Inner(outer);
        inner.fun();
    }
}

//Static Nested Class
class Outer{

    //static int x;

    int y;

    //as the inner class is static it does not need outer object
    //only can access/call the static value of the outer
    //it can do everything as a normal class
    //cant access non-static methods of outer
    static class Inner {
        Outer outer;

        Inner(Outer outer){
            this.outer=outer;
        }

        void fun(){
            System.out.println("Hello");
            System.out.println(outer.y);
        }

    }
}

class BankAccount{
    private static class InterestCalculator{
        static double calculateYearly(double principal,double rate){
            return principal*rate;
        }
    }
    //still can be accessed even after private
    public double computeInterest(double principal){
        return InterestCalculator.calculateYearly(principal,0.09);
    }
}
