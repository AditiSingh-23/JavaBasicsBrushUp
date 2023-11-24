import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Button {
    public static void main(String[] args) {

        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number");

            String s = bf.readLine();
            int num=Integer.parseInt(s);
            //maiking 3 button by using if elseIf
            /*System.out.println("this is the number "+num);
            if (num == 1)
                System.out.println("Namaste");
            else if (num == 2)
                System.out.println("Hello");
            else if (num == 3)
                System.out.println("Bonjore");
            else
                System.out.println("Invalid Input");*/


            //making buttons by using switch
            switch (num){
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Namaste");
                    break;
                case 3:
                    System.out.println("Bonjore");
                    break;
                default:
                    System.out.println("invalid");
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
