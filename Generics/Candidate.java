package Generics;

import java.util.ArrayList;
class Employee<T1>{
private T1 t1;
int n;

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Employee(T1 t1, int n) {
        this.t1 = t1;
        this.n = n;
    }
}
public class Candidate {
    Employee emp;
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList();
      //  arrayList.add("str");
        arrayList.add(42);
        arrayList.add(534);

        int num1=arrayList.get(0);
        System.out.println(num1);

        Employee<String> emp=new Employee<>("Help Hello Heoooan",34);
       String str= emp.getT1();
        System.out.println(str);
    }
}
