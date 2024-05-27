package src.main.java.ru.sgu.Third;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private final BlockingQueue<Food> queue;
    private final ArrayList<Food> foodList;

    public Producer(BlockingQueue<Food> queue, ArrayList<Food> foodList){
        this.queue = queue;
        this.foodList = foodList;
    }
    @Override
    public void run() {
        while(true){
            Random random = new Random();
            int indexFood = random.nextInt(foodList.size());
            try {
                System.out.println("Продюсер положил " + foodList.get(indexFood).getName() + " в очередь");
                queue.put(foodList.get(indexFood));
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
