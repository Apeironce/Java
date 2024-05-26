package src.main.java.ru.sgu;

import java.util.concurrent.RecursiveTask;

public class Fibonacci extends RecursiveTask<Integer> {
    private final int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n <= 1) {
            return n;
        } else {
            Fibonacci n_1 = new Fibonacci(n - 1);
            n_1.fork();
            Fibonacci n_2 = new Fibonacci(n - 2);
            return n_2.compute() + n_1.join();
        }
    }
}
