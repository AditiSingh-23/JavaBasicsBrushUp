package Practice.Recurssion;

public class StringReverse {
    public static boolean reverse(String str,int start,int end){
        if(end==start) return true;
        if(str.charAt(start)!=str.charAt(end)) return false;
        return reverse(str,start+1,end-1);
    }
    public static void main(String[] args) {
        String str="RADAxdgfchvjR";
        int start=0;
        int end=str.length()-1;
    // boolean result=StringReverse.reverse(str,start,end);
       if(StringReverse.reverse(str,start,end)==true){
           System.out.println("String is pallindrone");
       }
       else System.out.println("Its not pallindrone");
    }
}
