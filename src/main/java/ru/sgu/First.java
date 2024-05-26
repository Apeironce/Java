package src.main.java.ru.sgu;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

public class First {

    public static void dif_date() {
        Scanner input = new Scanner(System.in);
        int[] d1 = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] d2 = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        LocalDate date1 = LocalDate.of(d1[0], d1[1], d1[2]);
        LocalDate date2 = LocalDate.of(d2[0], d2[1], d2[2]);


        long period = ChronoUnit.DAYS.between(date1, date2);
        System.out.print(period);
    }

}
