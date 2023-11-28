package strings;

import java.util.Arrays;

public class ReversingString {
    public static void main(String[] args) {

       StringBuilder sb=new StringBuilder("My name is Aditi");

            for(int i=0;i<sb.length()/2;i++){
                int lastIndex=sb.length()-1-i;
                int startIndex=i;
                char start=sb.charAt(startIndex);
                char end=sb.charAt(lastIndex);
                sb.setCharAt(startIndex,end);
                sb.setCharAt(lastIndex,start);
            }
        System.out.println(sb);

            String str=new String("Welcome to the world of Coding !");
            char[]  chars=str.toCharArray();
        System.out.println(new String(chars)+"  :Before Reversing ");

        //when u r dealing with strings ,why to use swap when there are in built functions
        // instead of this use charAt()
      /*      for(int i=0;i<chars.length/2;i++){
                int lastIndex=str.length()-1-i;
                char temp=chars[i];
                 chars[i]=chars[lastIndex];
                chars[lastIndex]=temp;
            }*/


        System.out.println(new String(chars)+"  :After Reversing ");
    }
}

