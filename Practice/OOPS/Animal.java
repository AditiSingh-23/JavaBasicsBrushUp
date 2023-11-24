package Practice.OOPS;

 abstract class Animal {
    String name;
    public Animal(String name){
        this.name=name;
    }
    public String printName(){
        return this.name;
    }

    public abstract void sound();
}
class Cat extends Animal{
     String name;
     public Cat(String name){
         super(name);
     }
    @Override
    public void sound() {
        System.out.println(printName()+"meows!");
    }
}
class Dog extends Animal{

     String name;
     public Dog(String name) {
         super(name);
     }

     @Override
    public void sound() {
         System.out.println(printName()+"barks !");
    }
}

class Main{
    public static void main(String[] args) {
        Animal cat=new Cat("Marolley ");
        cat.sound();
        Animal dog=new Dog("Cookiee ");
        dog.sound();
    }
}
