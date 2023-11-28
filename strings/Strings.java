package strings;

public class Strings {
    public static void main(String[] args) {
        //making string through StringBuilder
        StringBuilder sb=new StringBuilder("Tony");
        //char at string 0
        for(int i=0;i<sb.length();i++){
            System.out.print(sb.charAt(i));
        }
        //setCharAt
       sb.setCharAt(0,'P');
        System.out.print("\n"+sb);
        //insert
        sb.insert(0,'S');
        sb.setCharAt(1,'t');
        //i want to insert extra 'n' and make 'Stonny'
        sb.insert(3,'n');
        //now I want to del a char S and extra 'n'
        sb.delete(3,4);
        sb.delete(0,1);
        System.out.println("\n"+sb);
    }
}
