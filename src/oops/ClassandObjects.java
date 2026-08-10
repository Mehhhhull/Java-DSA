package oops;

public class ClassandObjects {
    public static void main(String[] args){
        Student1 s1=new Student1();
        Student1 s2=new Student1();


        s1.name="Aditya";
        s1.age=28;
        s1.rollNumber=100;
        s1.college="IIT DHOLAKPUR";

        s2.name="Rohit";
        s2.age=80;
        s2.rollNumber=101;
        s2.college="IIT CHINA";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();
    }
}

class Student1{
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance(){
        System.out.println("Attendance Marked by"+name);
    }

    void print(){
        System.out.println(name+" "+age+" "+college);
    }
}

//Java is almost complete OOP langauge.
