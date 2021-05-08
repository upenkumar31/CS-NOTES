import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ProducerConsumerWithSemaphore {
    public static void main(String args[]){
        Queue queue = new LinkedList();
        Semaphore semaphore = new Semaphore(2);
        ProducerSemaphore producer = new ProducerSemaphore(queue,semaphore);
        ConsumerSemaphore consumer = new ConsumerSemaphore(queue,semaphore);
        producer.start();
        consumer.start();
    }
}

class ProducerSemaphore extends Thread {
    Queue<String> queue;
    Semaphore semaphore;
    ProducerSemaphore(Queue<String> queue,Semaphore semaphore)
    {
        this.queue=queue;
        this.semaphore = semaphore;
    }
    @Override
    public void run()  {

        try {
            while (true) {
                semaphore.acquire();
                if (queue.size()<10) {

                    System.out.println("Producer is Working");
                    queue.add(Thread.currentThread().getName());
                }
                Thread.sleep(1000);
                semaphore.release();
            }
        }catch (InterruptedException exception)
        {
            exception.getCause();
        }

    }
}
class ConsumerSemaphore extends Thread {
    Queue<String> queue;
    Semaphore semaphore;
    ConsumerSemaphore(Queue<String> queue,Semaphore semaphore ){
        this.queue=queue;
        this.semaphore = semaphore;
    }
    @Override
    public void run() {
        try {
            while (true) {
                semaphore.acquire();
                if (!queue.isEmpty()) {
                    System.out.println("Consumer is working");
                    System.out.println(queue.poll());
                }
                Thread.sleep(1000);
                semaphore.release();
            }
        }catch (InterruptedException exception)
        {
            exception.getCause();
        }
    }
}
