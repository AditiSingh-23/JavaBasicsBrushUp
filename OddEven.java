import java.io.BufferedReader;
import java.io.InputStreamReader;
public class OddEven {
    public static void main(String[] args) throws Exception{
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a number odd/even or invalid");
        int input=bf.read();

        if(input%2==0)
            System.out.println("input was even " + input);
        else {
            if(input>50)

                System.out.println("number is above 50");

            else
                System.out.println("Invalid number");}
    }
}
