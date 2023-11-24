package Practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//check if the string is pallindrone or not
public class ReverseOfString {
    public static void main(String[] args) throws Exception{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String input=bf.readLine();
        int start=0;
        int end=input.length()-1;
        boolean flag=false;
        while(start<=end){
            if(input.charAt(start)==input.charAt(end)){
                flag=true;
            }
            start++;
            end--;
        }
        if (flag==true)
            System.out.println("String is Pallindrone");
        else System.out.println("String is not pallindrone");
    }
}