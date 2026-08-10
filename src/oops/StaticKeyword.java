package oops;

//static keyword
public class StaticKeyword {
    public static void main(String[] args){
        Student s1=new Student("Mehul",21,101);
        Student s2=new Student("Shubham",11,102);



        System.out.println(s1.name + " , "+s1.age+", "+s1.rollNumber+" , "+s1.college);
        System.out.println(s2.name + " , "+s2.age+", "+s2.rollNumber+" , "+s2.college);
    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    static String college="IISC";
    static int grade;

    Student(String name,int age,int rollNumber){
        this.name=name;
        this.age=age;
        this.rollNumber=rollNumber;


    }
    //static block
    static {
//        college="IISC"; either here or directly above.
        //static blocl always runs first
        grade=9;
    }
}
