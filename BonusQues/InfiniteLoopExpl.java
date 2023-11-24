package BonusQues;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class InfiniteLoopExpl {

    public static void main(String[] args) {
        String c="";
        do{
            try{
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter two numbers");
           String num1= reader.readLine();
           String num2=reader.readLine();
            int n1=Integer.parseInt(num1);
            int n2=Integer.parseInt(num2);
                System.out.println("Addition is:"+(n1+n2));
                System.out.println("Do u want to again perform this ??(y/n)");
                 c=reader.readLine();
            }catch(Exception ex){ex.printStackTrace();}
        }while(c.charAt(0)=='Y' || c.charAt(0)=='y');
    }
}
