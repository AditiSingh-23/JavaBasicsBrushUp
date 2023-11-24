package LambdaFunction;
import java.lang.Thread;
//using Lambda to create threads ,since Runnable is a functional interfaec
public class Threads {
    public static void main(String[] args) {

        //first thread 1
        Runnable t1=()->{
             for(int i=0;i<10;i++){
                 System.out.println("Thread 1");
                 try {
                     Thread.sleep(1222);
                 }catch(InterruptedException ex){ex.printStackTrace();}
             }
        };
        //second thread t2
        Runnable t2=()->{
            for(int i=0;i<10;i++){
                System.out.println("2 X "+i+"="+(2*i));
                try{Thread.sleep(1000);}catch(Exception ex){ex.printStackTrace();};
            }
        };

        Thread t=new Thread(t1);
        t.setName("thread1 ");
        t.start();

        Thread tt=new Thread(t2);
        tt.setName("Thread 2");
        tt.start();
    }

}
