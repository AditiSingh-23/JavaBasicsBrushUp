package Practice.LamdaFunction;

public class MyThread {
    public static void main(String[] args) {
        //annonymous class
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println("Thread 1 executiing ");
                   try{Thread.sleep(1873);}catch(Exception ex){ex.printStackTrace();}
                }
            }
        };
        Thread t1=new Thread(r);
            t1.start();
        //lamda function se
        Runnable r1=()->{
            for(int i=0;i<5;i++)
                System.out.println("Thread 2 executing ");
            try{Thread.sleep(2322);} catch(Exception ex){ex.printStackTrace();}
        };

        Thread t2=new Thread(r1);
        t2.start();
    }
}
