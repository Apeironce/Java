package src.main.java.ru.sgu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class First {
    public List<mySort> createList() {
        List<mySort> myList = new ArrayList<>();
        String fileName = "new.txt";
        try {
            BufferedReader read = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = read.readLine()) != null) {
                String[] str = line.split(" ");
                StringBuilder fio = new StringBuilder();
                fio.append(str[0]).append(" ").append(str[1]).append(" ").append(str[2]);
                mySort first = new mySort(fio.toString(), str[str.length - 2], Integer.parseInt(str[str.length - 1]));
                myList.add(first);
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        return myList;
    }

    public static void print(List<mySort> list) {
        Collections.sort(list);
        Set<String> set = new HashSet<>();
        for (mySort x : list) {
            if (set.add(x.toString())) {
                System.out.println(x);
            }
        }
    }
}
