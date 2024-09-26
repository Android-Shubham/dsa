package multithreading;

public class Java8Runnable {
    public static void main(String[] args) {
        Runnable r = ()->{
            for (int i = 0; i < 4; i++) {
                System.out.println(i+"--"+Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(r);
        t1.start();
    }
}
