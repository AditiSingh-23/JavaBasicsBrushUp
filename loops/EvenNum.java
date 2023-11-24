package loops;
import java.util.Scanner;
public class EvenNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("Even numbers till "+n+" are :");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(" "+i);
            }
        }
    }
}
