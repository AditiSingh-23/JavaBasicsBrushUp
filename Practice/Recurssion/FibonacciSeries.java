package Practice.Recurssion;

import java.util.Scanner;

public class FibonacciSeries {
    public static int printFibo(int n){
        if(n==1 || n==2) return 1;
       return printFibo(n-1)+printFibo(n-2);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which term of the fibo series you want to print?");
        int n=sc.nextInt();
        System.out.println(FibonacciSeries.printFibo(n));
    }
}
