package Functions;
import java.util.Scanner;
public class GreaterOfTwo {
    public static int  greaterOffTwo(int num1,int num2){
       /* if(num1>num2)
            return num1;
        else return num2;*/
        return Math.max(num1,num2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num 1:");
        int num1=sc.nextInt();
        System.out.println("Enter num 2:");
        int num2=sc.nextInt();
        System.out.println("Greater of two is :"+greaterOffTwo(num1,num2));
    }
}
