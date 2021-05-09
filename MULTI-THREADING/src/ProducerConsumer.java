import java.util.LinkedList;
import java.util.Queue;
public class ProducerConsumer {
    public static void main(String args[]){
        Queue queue = new LinkedList();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        producer.start();
        consumer.start();
    }
}

class Producer extends Thread {
    Queue<String> queue;
    Producer(Queue<String> queue)
    {
        this.queue=queue;
    }
    @Override
    public void run() {
        try {
            while (true) {
                if (queue.size()<10) {
                    System.out.println("Producer is Working");
                    queue.add(Thread.currentThread().getName());
                }
                Thread.sleep(1000);
            }
        }catch (InterruptedException exception)
        {
            exception.getCause();
        }
    }
}
class Consumer extends Thread {
    Queue<String> queue;
    Consumer(Queue<String> queue){
        this.queue=queue;
    }
    @Override
    public void run() {
        try {
            while (true) {
                if (!queue.isEmpty()) {
                    System.out.println("Consumer is working");
                    System.out.println(queue.poll());
                }
                Thread.sleep(1000);
            }
        }catch (InterruptedException exception)
        {
            exception.getCause();
        }
    }
}
