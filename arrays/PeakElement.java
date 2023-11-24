package arrays;
//find the peak element which is not smaller than its neighbor
public class PeakElement {
    public static int[] peakElement(int[] arr){
       int[] element=new int[3];
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
                element[i-1]=arr[i];
        }
        return element;
    }
    public static void main(String[] args) {
        int arr[]={3,5,2,8,7};

        int[] result= PeakElement.peakElement(arr);
        for (int i:
             result) {
            System.out.print(i+",");
        }
    }
}
