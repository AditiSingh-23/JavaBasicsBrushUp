package Practice.Recurssion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PowerOfN {
    public static int printPower(int x,int pow){
        if(pow==0) return 1;
        int partialAns=printPower(x,pow/2);
        if (pow%2==1) return partialAns*partialAns*x;
        else
         return partialAns*partialAns;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter x:");
       String x=bf.readLine();
       int X=Integer.parseInt(x);
        System.out.println("Enter power");
        String n=bf.readLine();
        int pow=Integer.parseInt(n);
        System.out.println(X+"^"+pow+" :"+printPower(X,pow));
    }
}
