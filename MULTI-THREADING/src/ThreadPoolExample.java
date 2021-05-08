import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample extends Thread{

    int threadId;
    ThreadPoolExample(int threadId)
    {
        this.threadId=threadId;
    }
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+" "+threadId);
            Thread.sleep(1000);
        }catch (InterruptedException exception)
        {
            exception.getCause();
        }
    }
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for(int i=0;i<10;i++)
        {
            Runnable worker = new ThreadPoolExample(i);
            executor.execute(worker);
        }
        executor.shutdown();
        while(!executor.isTerminated()){};
        System.out.println("Task Completed");

    }
}
