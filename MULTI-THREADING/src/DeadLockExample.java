public class DeadLockExample  extends Thread{
    String resource1 ="ABC";
    String resource2 ="XYZ";
    DeadLockExample(String name)
    {
        this.setName(name);
    }
    @Override
    public void run() {
        try {
            if(Thread.currentThread().getName().equals("A")) {
                synchronized (resource1) {
                    System.out.println(resource1);
                    Thread.sleep(1000);
                    synchronized (resource2) {
                        System.out.println(resource2);
                    }
                }
            }
            if(Thread.currentThread().getName().equals("B")) {
                synchronized (resource2) {
                    System.out.println(resource2);
                    Thread.sleep(1000);
                    synchronized (resource1) {
                        System.out.println(resource1);
                    }
                }
            }
        }catch (InterruptedException e)
        {
            e.getCause();
        }
    }
    public static void main(String[] args)
    {
        DeadLockExample deadLockExample1 = new DeadLockExample("A");
        DeadLockExample deadLockExample2 = new DeadLockExample("B");
        deadLockExample1.start();
        deadLockExample2.start();
    }
}
