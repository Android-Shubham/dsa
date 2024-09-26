package multithreading.callable;

import java.util.concurrent.FutureTask;

public class CallableFutureDemo {
    public static void main(String[] args) {
        CallableThread callableThread = new CallableThread();
        FutureTask<Integer> res = new FutureTask<>(callableThread);
        Thread thread = new Thread(res);
        thread.start();
        try {
            System.out.println(res.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread");
    }
}
