package Practice.HackerEarth;

import java.util.ArrayList;
import java.util.List;

public class MaxSumArray {
    public static long veryBigSum(List<Long> ar){
     //   Integer[] arr=ar.toArray(new Integer[ar.size()]);
        Long[] arr=ar.toArray(new Long[0]);
        long sum=0L;
        for(int i=0;i<ar.size();i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Long> ar=new ArrayList<>();
        ar.add(10000000008L);
        ar.add(100000000000L);
        System.out.println( veryBigSum(ar));
    }
}
