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
   A thread is in terminated or dead state when its run() method exits.