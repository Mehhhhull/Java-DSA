package oops;

public class chainingofconstructor {
    public static void main(String [] args){
        student s0=new student();
        student s1=new student("Mehul");
        student s2=new student("Kah",50);
        student s3=new student("Kalh",55,103);
        student s4=new student("Kalh",55,103,"IIT B");

        System.out.println(s3.rollNumber);

    }
}

class student{
    String name;
    int age;
    int rollNumber;
    String college;

    student(){
//       this("Unknown",0,0,"unknown");
        this("Unknown");//2nd way of constructor chaining
    }

    student(String name){
//        this(name,0,0,"unknown"); //this can be used to call one contructor from another
        this(name,0);
    }

    student(String name,int age){
//        this.name=name;
//        this.age=age;
//        this(name,age,0,"unknown");//chaining of contructor
        this(name,age,0);
    }

    student(String name,int age,int rollNumber){
//        this.name=name;
//        this.age=age;
//        this.rollNumber=rollNumber;
        this(name, age,rollNumber,"unknown");
    }

    student(String name,int age,int rollNumber,String college){
        this.name=name;
        this.age=age;
        this.rollNumber=rollNumber;
        this.college=college;
    }

    void markAttendance(){
        System.out.println("Attendance marked for student"+ name);
    }
}
