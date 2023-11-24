package strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestPrefix(String[] arr){
        Arrays.sort(arr);

        int count=arr.length;
        System.out.println(count);
       int length=Math.min(arr[0].length(),arr[count-1].length());//it is the length of common string
        System.out.println(length);
       int i=0;
       while(i<length && arr[0].charAt(i)==arr[count-1].charAt(i)){
           i++;
       }
        System.out.println(i);
       String pre=arr[0].substring(0,i);
       return pre;
    }
    public static void main(String[] args) {
        String[] arr={"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(LongestCommonPrefix.longestPrefix(arr));
    }
}
