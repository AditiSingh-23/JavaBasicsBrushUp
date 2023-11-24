package Practice.Recurssion;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr={34,44,52,66,98};
        System.out.println("original array");
        printArray(arr);
        int start=0, end=arr.length-1;
        System.out.println("\nAfter reversing");
        reverseArray(arr,start,end);
        printArray(arr);
    }

    public  static void reverseArray(int[] arr,int start,int end) {
        if(start<=end) {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            reverseArray(arr,start+1,end-1);
        }
    }
    public static void printArray(int[] arr){
        for (int i:
             arr) {
            System.out.print(" "+i);

        }
    }
}
