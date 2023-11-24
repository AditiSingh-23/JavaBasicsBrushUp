package Practice.Recurssion;
//to find the sum of N natural numbers by Recurssion
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumOfNum {
    public static int printSum(int num){
        if(num==1)return 1;
        //task
       return num+printSum(num-1);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String num=bf.readLine();
        int numm=Integer.parseInt(num);
        System.out.println("Sum of "+numm+" Natural num :"+printSum(numm));
    }

}
