package Inheritance;
//types of inheritance
//Simple heritance
//multi-level inheritance
//hierarchical inheritance
//multiple inheritance(not supported in JAVA, but other languages have it, but theoretically it is there)

public class typesofinheritance {
    public static void main(String[] args){
        //CSEngineeringStudent CS1=new CSEngineeringStudent();//multi level inheritance
        //can call all except private
    }
}

class Student1{//parent class. Say class A
    String name;
    int age;

    public void markAttendance(){
        System.out.println("Attendance Marked");
    }
}

class EngineeringStudent1 extends Student{//child class //Say class B
    void attendLab(){
        System.out.println("Lab Attended");
    }
}
class MedicalStudent1 extends Student{//child class //Say class C
    void attendLab(){
        System.out.println("Lab Attended");
    }
}

//class CSEngineeringStudent extends EngineeringStudent1{
//    void attendCSELAB(){}
//}

/*
Multi level inheritance
A->B->C

hierarchical inheritance
     A
    / \
   B   C
   here in above engineeringstudent1 as well as medicalstudent1 both are child of A that means its hierarchichal inheritance
   Allthe children get the properties and methods of the same parent,but they won't inherit from each other

  Multiple Heritance:
  Opposite of Hirarechical
  A   B
   \  /
    C
    A and B both combine to be Parent of C
 */
