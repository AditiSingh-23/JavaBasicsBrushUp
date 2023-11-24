package Recurssion;

public class FibonnaciSeries {
    public static void fibSeries(int n1,int n2,int fib){
        //base case
        if(fib==10) return;
        int partialFact=n1+n2;
        System.out.println(partialFact);
        fibSeries(n2,partialFact,fib+1);
    }
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int fib=1;
        FibonnaciSeries.fibSeries(n1,n2,fib);
    }
}
