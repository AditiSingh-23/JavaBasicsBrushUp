package Functions;
import java.util.Scanner;
public class Factorial {
    public int factorialNumber(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to get the factorial");
        int num=sc.nextInt();
        Factorial f=new Factorial();
        System.out.println("The factorial is "+f.factorialNumber(num));
    }
}
