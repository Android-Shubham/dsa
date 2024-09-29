package multithreading.synchronization;

import java.util.concurrent.CountDownLatch;

public class SynchroTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(somemethod(Thread.currentThread().getName()));
                    latch.countDown();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        latch.await();
        System.out.println(somemethod(Thread.currentThread().getName()));
    }

    private synchronized static String somemethod(String str) throws InterruptedException {
        Thread.sleep(2000);
        return str;
    }
}
