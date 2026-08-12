package Inheritance;

public class SuperKeyword {
    public static void main(String[] args){
        EngineeeringStudent es1=new EngineeeringStudent("Mehul",23,101,"IIT");
        es1.print();
    }
}

class Student2{
    String name;
    int age;
    int rollNo;
//    int x;

    Student2(){}

    Student2(String name,int age,int rollNo){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
    }

    void print(){
        System.out.println(name+" , "+ age+" , "+rollNo);
    }
}

class EngineeeringStudent extends Student2{
    String college;
//    int x;

    EngineeeringStudent(String name,int age,int rollNo,String college){
        super(name,age,rollNo);
        this.college=college;
    }

    void print(){
//        System.out.println(super.name+" , "+ super.age+" , "+super.rollNo+" , "+super.x);
         super.print();
         System.out.print(college);
    }
}
