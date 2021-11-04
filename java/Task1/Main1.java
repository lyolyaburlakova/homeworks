package Task1;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();

    }
}