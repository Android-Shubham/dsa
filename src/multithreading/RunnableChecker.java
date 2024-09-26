package multithreading;

public class RunnableChecker {
    public static void main(String[] args) {
        RunnableWorker runnableWorker = new RunnableWorker();
        Thread t1 = new Thread(runnableWorker);
        Thread t2 = new Thread(runnableWorker);
        Thread t3 = new Thread(runnableWorker);
        t1.start();
        t2.start();
        t3.start();
    }
}
