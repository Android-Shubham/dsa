package multithreading;

public class Checker {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();
        Worker worker4 = new Worker();
        Worker worker5 = new Worker();
        Worker worker6 = new Worker();
        worker1.start();
        worker2.start();
        worker3.start();
        worker4.start();
        worker5.start();
        worker6.start();
    }
}
