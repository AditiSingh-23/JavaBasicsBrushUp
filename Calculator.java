import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int first = sc.nextInt();
        System.out.println("enter second number");
        int second = sc.nextInt();
        System.out.println("which operation you want to perform ");
        System.out.println(":1- Addition :2- Substraction: 3- Multiplication: 4- / :5- %");
        int num=sc.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("The addition is "+(first+second));
                break;
            case 2:
                System.out.println("The substraction is "+(first-second));
                break;
            case 3:
                System.out.println("The multiplication is "+(first*second));
                break;
            case 4:
                System.out.println("The division is "+(first/second));
                break;
            case 5:
                System.out.println("The modulo is "+(first%second));
                break;
            default:
                System.out.println("Please enter a valid input ");
        }
    }
}
