package Practice.HackerEarth;

import java.util.*;

public class Example {
    public static List<Integer> compareTriplets(List<Integer> a,List<Integer> b){
        //converting a list to Array
      Integer[] alice=  a.toArray(new Integer[a.size()]);
      Integer[] bob=b.toArray(new Integer[b.size()]);
      int alicePoint=0;
      int bobPoint=0;
      for(int i=0;i<3;i++){
          if(alice[i]>bob[i])
            alicePoint++;
          else if (alice[i]<bob[i]) {
              bobPoint++;
          }
      }
        List<Integer> res= new ArrayList<>();
      res.add(alicePoint);
      res.add(bobPoint);
      return res;
    }
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        List<Integer> b=new ArrayList<>();
        b.add(3);
        b.add(7);
        b.add(10);
    List<Integer> res=compareTriplets(a,b);

        for(int i=0;i< res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
