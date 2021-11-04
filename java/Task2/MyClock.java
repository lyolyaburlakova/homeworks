package Task2;

public class MyClock extends Thread {

    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted())
        {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
            System.out.println("Tik");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
            System.out.println("Tak");
        }
    }

}
