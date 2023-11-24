import java.util.Scanner;
public class GroceryItems {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int num=sc.nextInt();

        if(num>18)
            System.out.println("Person is Adult");
        else System.out.println("Person is not adult");
    }
}
