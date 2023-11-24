package BonusQues;

public class FibonacciSeries {

    public static void printFib(int n1,int n2,int terms){
        if(terms>0){
        int next=n1+n2;
        System.out.println(next);
         printFib(n2,next,terms-1);
        }
    }
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        System.out.println(num1);
        System.out.println(num2);
        int terms =10 ;  //to define the exit condition
        FibonacciSeries.printFib(num1,num2,terms);
    }
}
