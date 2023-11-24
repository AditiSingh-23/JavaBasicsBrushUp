package arrays;

import java.util.*;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        Integer[] arr1={1,2,3,4,5};
        Integer[] arr2={4,5,6,7,8};

        List<Integer> list1=Arrays.asList(arr1);
        List<Integer> list2=Arrays.asList(arr2);

        Set<Integer> set1=new HashSet<>(list1);
       set1.retainAll(list2);

       Integer intersectionArray[]=set1.toArray(new Integer[0]);
        System.out.println(Arrays.toString(intersectionArray));
    }
}
