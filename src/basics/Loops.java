package basics;

public class Loops {
    public static void main(String [] args) {
        //loops-> while loop
        //int i=1;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }
//        do{
//            System.out.println(i);
//            i++;
//        } while(i<=10);


        //1 to 10
//        for (int i = 0; i <=10; i++) {
//            System.out.println(i);
//        }
        /*
        flow of control of for loop
        1.First assignement statement is executed(Variable Defination)
        2.Then second conditional statement iis evaluated(T/F)
        3.if true->control flow will evaluate the body of the loop
        4.Once loop is finished,control flow will go back to the for statement, and third increment statement will be evaluated
        5.Again,conditional statement is evaluated
        6.Repeat  2-5
         */

        //nested loops
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//
//            }
//        }

        //pattern printing
//        for (int i = 1; i <=5; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println("");
//
//
//        }

        //jump statements
        //break,continue
//        for (int i = 1; i < 10; i++) {
//            System.out.println(i);
//
//            if(i>5){
//                break;
//            }
//
//        }

        //prime or not
//        int p=9;
//        int i;
//        for(i=2;i<p;i++){
//            if(p%i==0){
//                System.out.println("not prime");
//                break;
//            }
//        }
//        if(i==p){
//            System.out.println("The number is prime");
//        }

        //continue
//        for (int i = 1; i < 10 ; i++) {
//            if(i % 2 == 0){
//                continue;
//            }
//
//            System.out.println(i);
//
//        }


        //break in nested loops
//        for (int i = 1; i <=10; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//
//                if(j>=5){
//                    break; //continue
//                }
//
//            }
//            System.out.println("");
//
//
//        }

        //labels
//        outer: for (int i = 1; i <=10; i++) {
//            inner: for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//
//                if(j>=5){
//                    break outer;
//                }
//
//            }
//            System.out.println("");
//
//
//        }

        //whatever comes inside curly braces is called code blocks
        //naming a code block
        first:{
            second:{
                third:{

                }
            }

        }


    }
    }

