package Functions;
import java.util.Scanner;
public class SumOfOdd {
    public static int sumOfOdd(int num){
        int sum=0;
        for(int i=1;i<=num;i++) {
            if(i%2!=0) {
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Sum of "+num+" odd numbers is "+sumOfOdd(num));
    }
}
