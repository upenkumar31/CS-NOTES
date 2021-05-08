public class ThreadExample {
    public static void main(String[] args) throws Exception
    {
        Thread thread = Thread.currentThread();
        long threadId = thread.getId();  // getting thread id
        thread.getId(); // for thread id
        thread.getThreadGroup(); // getting thread group
        thread.getContextClassLoader(); // for class loader
        thread.getPriority(); // getting priority
        thread.getName(); // getting Name
        thread.isAlive(); // live status
        thread.isInterrupted(); // is interrupted
        thread.run(); // put into runnable state
        thread.checkAccess(); // check access
        thread.join(thread.getId()); // join thread
        thread.isDaemon(); // thread is daemon
        thread.setContextClassLoader(new ClassLoader() {});
        thread.start(); // start execution of thread
        thread.wait(1000);
        thread.notify();
        thread.suspend();  //suspend thread
        thread.resume(); // start suspended thread
    }
}
