package src.main.java.ru.sgu;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Second {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();

        final ForkJoinPool forkJoinPool = new ForkJoinPool();
        final ForkJoinTask<Integer> res = forkJoinPool.submit(new Fibonacci(in));

        System.out.println(res.join());

    }
}
