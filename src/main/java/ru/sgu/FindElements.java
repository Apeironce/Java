package src.main.java.ru.sgu;

import java.util.*;

public class FindElements {
    public static void main(String[] args) {
        FindElements findElements = new FindElements();
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        ArrayList<Integer> inputList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            inputList.add(input.nextInt());
        }
        findElements.findSecondMax(inputList);
        findElements.findThirdMin(inputList);
    }

    public void findSecondMax(List<Integer> list) {
        try {
            System.out.println(list.stream()
                    .sorted(Comparator.reverseOrder())
                    .skip(1)
                    .findFirst().get());
        } catch (NoSuchElementException e) {
            System.out.println("В списке менее 2-х элементов");
            System.exit(0);
        }
    }

    public void findThirdMin(List<Integer> list) {
        try {
            System.out.println(list.stream()
                    .sorted()
                    .skip(2)
                    .findFirst().get());
        } catch (NoSuchElementException e) {
            System.out.println("В списке менее 3-х элементов");
        }

    }
}
