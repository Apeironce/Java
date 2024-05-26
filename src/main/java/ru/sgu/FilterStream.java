package src.main.java.ru.sgu;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Scanner;

public class FilterStream {
    public static void main(String[] args) {
        FilterStream filterStream = new FilterStream();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> inputList = new ArrayList<Integer>();
        int in;

        do {
            in = input.nextInt();
            inputList.add(in);
        } while (input.hasNextInt());
        input.close();

        filterStream.filterList(inputList);
    }

    public void filterList(ArrayList<Integer> inputList) {
        Predicate<Integer> notEven = x -> x % 2!=0;
        inputList.stream()
                .filter(notEven)
                .forEach(System.out::println);

    }
}
