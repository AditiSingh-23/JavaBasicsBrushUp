package Oops;
//copy constructor
public class Student {

    String studentName;
    int stdId;

    public Student(Student s1) {
     this.studentName=s1.studentName;
     this.stdId=s1.stdId;
    }
    public Student() {

    }
    public void printDetails(){
        System.out.println("Student's details are :"+this.studentName+" Id :"+this.stdId);
    }
    public static void main(String[] args) {
            Student s=new Student();
            s.stdId=1;
            s.studentName="Aman Dhatarwal";
           Student s2=new Student(s);
           s2.printDetails();
    }
}
