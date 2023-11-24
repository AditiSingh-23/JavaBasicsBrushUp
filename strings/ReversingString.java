package strings;

public class ReversingString {
    public static void main(String[] args) {

        String str="geeks quiz practice code";
        int size=str.length();
        char[] chars=new char[size];

        for(int i=size-1;i>=0;i--) {
            chars[i] = str.charAt(i);
            System.out.print(chars[i] + "");
        }
    }
}

