package strings;

public class String_Manipulation {
    public static void main(String[] args) {

        String str1="hello";
        String str2="hello";
        System.out.println(str1==str2); //true
        System.out.println(str1.equals(str2)); //true

        String str11=new String("hello");
        String str22=new String("hello");
        System.out.println(str11.equals(str22));//true
        System.out.println(str11==str22);//false

    }
}
