package Functions;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CircumferanceOfCircle {
    public double  circumferanceOfC(int radius){
        return (2 * Math.PI * radius);
    }
    public static void main(String[] args) {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter radius");
        String str=bf.readLine();
        int radius =Integer.parseInt(str);
        CircumferanceOfCircle coi=new CircumferanceOfCircle();
       System.out.println( "Circumferance of Circle is "+coi.circumferanceOfC(radius));
        }catch(Exception ex){ex.printStackTrace();};
    }
}
