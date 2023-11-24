package Practice.OOPS;

class A{

}
class B extends A{}
public class Parent {
    A m1(){
        System.out.println("m1() method");
        return new A();
    }
}
class Child extends Parent{
    protected B m1(){
        System.out.println("m1() of child");
        return new B();
    }

    public static void main(String[] args) {
        Parent p=new Child();
        p.m1();
    }
}
