package BonusQues;

import java.util.Scanner;

//most comptible way to swap two numbers , reduces memory and space complexity
public class SwapANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num1 ");
        int num1=sc.nextInt();
        System.out.println("Enter a num2 ");
        int num2=sc.nextInt();

        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("num1 :"+num1+" num2 :"+num2);
    }
}
