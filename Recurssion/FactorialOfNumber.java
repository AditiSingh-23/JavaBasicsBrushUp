package Recurssion;
import java.util.Scanner;
public class FactorialOfNumber {
    public static int printFact(int num1){
        //base condition(because factorial of 1 is 1)
        if(num1==1)
            return 1;
       int partialfact= printFact(num1-1);
        System.out.println(partialfact);
        return partialfact*num1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num1=sc.nextInt();
        System.out.println("Factorial of "+num1+" is: "+FactorialOfNumber.printFact(num1));
    }
}
