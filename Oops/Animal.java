package Oops;

abstract class Animal {
    String name;
    public  String animal(){
        return "Welcome to the world of Animals ";
    }
    static void m1(){
        System.out.println("Static mehod of Animal");
    }
    Animal(){
        System.out.println("Default Animal Constructor");
    }
    abstract void walking();
}
class Cat extends Animal{
    public void walking(){
        System.out.println("Cat walks on 4 legs");
    }
    Cat(){
        System.out.println("It is default Cat Constructor");
    }
}
class Chicken extends Cat{
    Chicken(){
        System.out.println("This is Default Chicken Consructor");

    }
    public void walking() {
        System.out.println("Chicken walks on 2 legs");
    }
}
class MainFile{
    public static void main(String[] args) {
        Animal c=new Chicken();
        c.walking();
        c.m1();

    }
}