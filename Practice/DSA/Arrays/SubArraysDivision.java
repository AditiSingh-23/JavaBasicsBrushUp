package Practice.DSA.Arrays;

import java.util.Scanner;

public class SubArraysDivision {
    public static void main(String[] args) {
        System.out.println("Enter size ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Dividing array to2 subArrays: ");
        int mid = size / 2;
        int subArray1[] = new int[mid];
        int subArray2[] = new int[arr.length - mid];

        //printing the subArrays
        System.arraycopy(arr, 0, subArray1, 0, mid);
        System.out.println("SubArray1 :");
        printArray(subArray1);
        System.arraycopy(arr, mid, subArray2, 0, size - mid);
        System.out.println("\nSubArray2 :");
        printArray(subArray2);

        //checking that subArrays intersection must be null
        boolean flg=false;
        for(int i:subArray1){
            for(int j:subArray2){
                if(i==j)
                    flg=true;
                    break;
            }
            if(flg)break;
        }
        if(flg){
            System.out.println("\nArrays are intersecting ,Intersection should be null ");
        }else System.out.println("Arrays are not intersecting ");


    }
    public static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(" "+i);
        }
    }
}
