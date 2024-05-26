package src.main.java.ru.sgu;

import java.util.Scanner;

public class Second {
    public enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void get_day() {
        Scanner input = new Scanner(System.in);
        Day d = Day.valueOf(input.next().toUpperCase());
        int n = input.nextInt();
        Day[] week = Day.values();
        Day day = week[(d.ordinal() + n) % 7];
        System.out.print(day.toString().toLowerCase());
    }
}
