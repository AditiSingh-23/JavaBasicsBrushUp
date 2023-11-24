package loops;
import java.util.Scanner;
public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int marks;
        do{
            System.out.println("enter num ");
            num=sc.nextInt();
            System.out.println("Enter marks :");
             marks=sc.nextInt();
        }while(num==1);

        if(marks>=90){
            System.out.println("This is Good !");
        } else if (marks>=60 && marks<=89) {
            System.out.println("This is also good !");
        } else if (marks>=0 && marks<=59) {
            System.out.println("This is good as well !");
        }
    }
}
