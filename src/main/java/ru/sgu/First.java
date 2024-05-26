package src.main.java.ru.sgu;

public class First {
    public static final int REPEAT = 100000;
    private static int counter = 0;
    private static final Object syncObj = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread myThread1 = new Thread(() -> {
            for (int i = 0; i < REPEAT; i++) {
                synchronized (syncObj) {
                    First.counter++;
                }
            }
        });

        Thread myThread2 = new Thread(() -> {
            for (int i = 0; i < REPEAT; i++) {
                synchronized (syncObj) {
                    First.counter++;
                }
            }
        });

        myThread1.start();
        myThread2.start();

        myThread2.join();
        myThread1.join();

        System.out.println(First.counter);
    }

}
