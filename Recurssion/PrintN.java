package Recurssion;

import Functions.Print;

public class PrintN {
    public static void printNum(int n){
        if(n==6) return;
        System.out.println(n);
          printNum(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        PrintN.printNum(1);
    }
}
