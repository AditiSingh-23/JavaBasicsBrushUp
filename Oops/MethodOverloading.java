package Oops;

public class MethodOverloading {

   public void area(int rad){
       System.out.println("area of Circle "+(Math.PI*rad*rad));
   }
   public void area(int length,int height){
       System.out.println("area of rectangle"+(length*height));
   }

    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        m.area(87,84);
    }
}
