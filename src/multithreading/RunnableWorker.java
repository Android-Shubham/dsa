package multithreading;

import javax.sound.midi.Soundbank;

public class RunnableWorker implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i+"--"+Thread.currentThread().getName());
        }
    }
}
