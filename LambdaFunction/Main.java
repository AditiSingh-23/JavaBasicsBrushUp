package LambdaFunction;
//if any INterface is Functional Interface ;
// we can make the use of Lambda functions and anonymous function to create instance and redefine the method
public class Main {

    public static void main(String[] args) {
        //basic way of calling the impl of Interface when we will explisitly implement it and by overriding that method
       // MyInter m=new Main();
      //  m.sayHello();


       //calling the impl of Interface with the help of anonymous class
        //isme Interface k child class ka object bana rahe hai inside this : {};
        MyInter n=new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("Imple of Interface");
            }
        };
        n.sayHello();
        MyInter n2=new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("this is second anonymous class ");
            }
        };

        //calling Interface impl through Lambda
        MyInter i=()->{
            System.out.println("impl of interface");
        };
        MyInter i2=()->{
            System.out.println("second impl of interface");
        };

    }

}
