package BonusQues;
import java.util.Scanner;
public class GreatestCommonDivisor {

    public int gcdCalculator(int num1, int num2){
      if(num2==0)
          return num1;
      else return gcdCalculator(num2,num1%num2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();

        GreatestCommonDivisor gcd=new GreatestCommonDivisor();
        int GCD=gcd.gcdCalculator(num1,num2);
        System.out.println( "LCM is :"+((num1 * num2)/GCD));
    }
}
