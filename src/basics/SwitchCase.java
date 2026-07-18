package basics;

public class SwitchCase {
    public static void main(String [] args){
        int i=3;

        switch (i){
            case 1:
                System.out.println("i is 1");
                break;

            case 2:
                System.out.println("i is 2");
                break;

            case 3:
                System.out.println("i is 3");
                break;
            default:
                System.out.println("i is more than 3");
                break;
        } //switch-> limited use case ->should evaluate to bye,short,int,char,enumeration.
        //no dublicate cases allowed
        //after jdk7, strings cn also be used as switch expression
        //after jdk14 more enhancement
    }
}
