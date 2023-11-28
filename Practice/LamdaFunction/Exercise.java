package Practice.LamdaFunction;

public class Exercise {


    public Exercise(Dieting dieting) {
        dieting.routeenCheck();
    }

    public static void main(String[] args) {
        Exercise ex1=new Exercise(new Dieting(){
            @Override
            public void routeenCheck() {
                System.out.println("Person should do regular exercise.");
            }
        });
        Exercise ex2=new Exercise(()->{
            System.out.println("Impl of Interface by using Lamda");
        });

    }
}
