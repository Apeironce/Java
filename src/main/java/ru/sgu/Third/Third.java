package src.main.java.ru.sgu.Third;

import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Third {
    public void run() {
        BlockingQueue<Food> queue = new LinkedBlockingQueue<>();
        ArrayList<Food> foodList = new ArrayList<Food>();
        foodList.add(new Food("Салат Вита",63));
        foodList.add(new Food("Печенье сдобное",458));
        foodList.add(new Food("Борщ",48));

        Producer producer = new Producer(queue, foodList);
        Consumer consumer1 = new Consumer(queue, "1-ый");
        Consumer consumer2 = new Consumer(queue, "2-ый");

        Thread producerThread = new Thread(producer);
        Thread consumer1Thread = new Thread(consumer1);
        Thread consumer2Thread = new Thread(consumer2);

        producerThread.start();
        consumer1Thread.start();
        consumer2Thread.start();
    }

    public static void main(String[] args) {
        new Third().run();

    }
}
