package Recurssion;

public class SumOfN {
    public static int sumOfn(int num){
        if (num==1) return 1;
        int partialSum=sumOfn(num-1);
        return num+=partialSum;
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println( "sum of N natural num  "+SumOfN.sumOfn(num));
    }
}
