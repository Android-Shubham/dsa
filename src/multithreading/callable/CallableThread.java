package multithreading.callable;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(10000);
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum+=i;
        }
        return sum;
    }
}
