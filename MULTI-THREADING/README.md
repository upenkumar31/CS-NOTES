#  **JAVA MULTI-THREADING**

1. Multithreading in Java is a process of executing multiple threads simultaneously.
2. A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading
3. we use the multithreading than multiprocessing because threads use a shared memory area. They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process

### **Thread Life Cycle**

1) New
   The thread is in new state if you create an instance of Thread class but before the invocation of start() method.

2) Runnable
   The thread is in runnable state after invocation of start() method, but the thread scheduler has not selected it to be the running thread.

3) Running
   The thread is in running state if the thread scheduler has selected it.

4) Non-Runnable (Blocked)
   This is the state when the thread is still alive, but is currently not eligible to run.

5) Terminated
   A thread is in terminated or dead state when its run()
   method exits.
   
### **Thread Methods**

`public void run(): is used to perform action for a thread.`

`public void start(): starts the execution of the thread.JVM calls the run() method on the thread.`

`public void sleep(long miliseconds): Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.`

`public void join(): waits for a thread to die.`

`public void join(long miliseconds): waits for a thread to die for the specified miliseconds.`

`public int getPriority(): returns the priority of the thread.`

`public int setPriority(int priority): changes the priority of the thread.`

`public String getName(): returns the name of the thread.`

`public void setName(String name): changes the name of the thread.`

`public Thread currentThread(): returns the reference of currently executing thread.`

`public int getId(): returns the id of the thread.`

`public Thread.State getState(): returns the state of the thread.`

`public boolean isAlive(): tests if the thread is alive.`

`public void yield(): causes the currently executing thread object to temporarily pause and allow other threads to execute.`

`public void suspend(): is used to suspend the thread(depricated).`

`public void resume(): is used to resume the suspended thread(depricated).`

`public void stop(): is used to stop the thread(depricated).`

`public boolean isDaemon(): tests if the thread is a daemon thread.`

`public void setDaemon(boolean b): marks the thread as daemon or user thread.`

`public void interrupt(): interrupts the thread.`

`public boolean isInterrupted(): tests if the thread has been interrupted.`

`public static boolean interrupted(): tests if the current thread has been interrupted.`