package ExceptionHandeling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class DefaultException extends Exception{
    DefaultException(){
        super("num1 should be less than num2");
    }
    DefaultException(String str){
        super(str);
    }
}
public class Example {
    public static void main(String[] args) {
        try{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter 2 numbers");
        String n1=bf.readLine();
        String n2=bf.readLine();
        int num1=Integer.parseInt(n1);
        int num2=Integer.parseInt(n2);
        if(num1>num2){
            throw new DefaultException("this is default exception msg");
        }
            System.out.println("Result :"+num1/num2);
        }
        catch(DefaultException ex){
            System.out.println(ex.getMessage());
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("program terminated");
        }
    }
}
