package oops;

//use of String[] args
//we used to use it to get input in argument and put in args[] array.
//used in internal config in springboot
public class Useofstringargs {
    public static void main(String[] args){
        System.out.println("No. of args are"+ args.length);

        for (int i = 0; i < args.length; i++) {

            System.out.println("Argument "+i+"="+args[i]);
        }
    }
}
