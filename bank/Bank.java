package bank;

import Oops.Shape;

class Account{

}
public class Bank extends Shape{
    public  String name;

    public void display(){
        System.out.println("Displays name ");
        Gname="Raghav"; //protected member
    }
    //protected members cannot be used from main method
    //to create protected members Object making is not required
}

