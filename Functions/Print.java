package Functions;
import java.util.Scanner;
public class Print {
    public static void main(String[] args) {
        int counterForPositive=0;
        int counterForNegative=0;
        int counterforZero=0;
        char res;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter numbers -ve / +ve / 0's");
            int num=sc.nextInt();
            if(num>0){
               counterForPositive++;
            } else if (num<0) {
                counterForNegative++;
            }else counterforZero++;

            System.out.println("Do you want to enter more numbers? (y/n)");
            res=sc.next().charAt(0);
        }while(res == 'y'||res=='Y');

        System.out.println("Total positive numerals are :"+counterForPositive);
        System.out.println("Total negative numerals are :"+counterForNegative);
        System.out.println("Total zero numerals are :"+counterforZero);
    }
}
