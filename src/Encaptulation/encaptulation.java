package Encaptulation;

public class encaptulation {
    public static void main(String[] args){

        BankAccount ba=new BankAccount();

        ba.deposit(500);
        ba.withdraw(300);
        System.out.println(ba.getBalance());

    }
}

class BankAccount{
   private double balance;

   public void deposit(int amount){
       balance += amount;
   }

    public void withdraw(int amount){
        balance -= amount;
    }
    //getters / setters
    public double getBalance(int amount) {
        return balance;
    }


}

class Student{
    private String name;
    private int rollNum;
    private int age;
    private String college;

    Student(String name,int rollNum,int age,String college){
        this.name=name;
        this.age=age;
        this.rollNum=rollNum;
        this.college=college;
    }

    //getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
