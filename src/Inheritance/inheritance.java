package Inheritance;

public class inheritance {
    public static void main(String[] args){
        EngineeringStudent es=new EngineeringStudent();
        es.markAttendance();
        es.attendLab();

        Student s1=new Student();
        s1.markAttendance();
        //s1.attendLab();-> this is wrong
    }
}

//inheritance is a parent child relationship
//Parent(super class)->child(subclass)
class Student{
    String name;
    int age;

    public void markAttendance(){
        System.out.println("Attendance Marked");
    }
}

class EngineeringStudent extends Student{
    void attendLab(){
        System.out.println("Lab Attended");
    }
}
