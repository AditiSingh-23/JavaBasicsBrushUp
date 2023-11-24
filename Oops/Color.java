package Oops;

 class Color {
    public void violet(){
        System.out.println("This is voilet color");
    }
}

 class Rainbow extends Color{
     public void violet(){
         System.out.println("Rainbow contains violet color");

     }

     public static void main(String[] args) {
         Color r=new Rainbow();
         r.violet();
     }
}
