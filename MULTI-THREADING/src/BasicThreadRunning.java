public class BasicThreadRunning extends Thread {
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            try {
                System.out.println(Thread.currentThread().getId() + "-> " + i);
                Thread.sleep(1000);
            }catch (InterruptedException exception)
            {
                exception.getCause();
            }
        }
    }
    public static void main(String[] args) throws Exception
    {
        BasicThreadRunning basicThreadRunning1 = new BasicThreadRunning();
        basicThreadRunning1.start();
        BasicThreadRunning basicThreadRunning2 = new BasicThreadRunning();
        basicThreadRunning2.start();

        basicThreadRunning1.join(basicThreadRunning2.getId());  // joining thread with main thread
    }
}
