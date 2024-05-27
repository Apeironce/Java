package src.main.java.ru.sgu.Third;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    private final BlockingQueue<Food> queue;
    private int consumerCalories = 0;
    public String name;

    public Consumer(BlockingQueue<Food> queue, String name) {
        this.queue = queue;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Food food = queue.take();
                consumerCalories += food.getCalories();
                System.out.println(this.name + " потребитель\n" +
                        "Съел - " + food.getName() +
                        "\nУпотребил - " + food.getCalories() +
                        "\nУпотребил всего - " + consumerCalories);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
