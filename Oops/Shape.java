package Oops;
import bank.*;

//Multilevel :when inheritance is in three levels : 1st is parent of second ,second is parent of 3rd ,
//Hirarcal Inheritance :when more than one child inherits one parent class
//Hybrid
//Multiple Inheritance works with Interface ,dont work with Class
public class Shape {
    protected String Gname;
    public void area(){
        System.out.println("Displaying area: ");
    }
}
class Triangle extends Shape{
    public void area(int length,int bredth){
        System.out.println("Area of Triangle is "+(2*length*bredth));
    }

}
class EquilateralTriangle extends Triangle{
    public void area(int r){
        System.out.println("Area of eqilateral triangle :"+(3.14*r*r));
    }
}
 class Main {
    public static void main(String[] args) {
        /*EquilateralTriangle w=new EquilateralTriangle();
        w.area(22,89);*/
        bank.Bank bank=new bank.Bank();
        bank.name="Kaushik";
        bank.display();
    }
}
