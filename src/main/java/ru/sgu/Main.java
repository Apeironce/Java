package src.main.java.ru.sgu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите номер задания (1, 2, 3): ");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        switch (in){
            case 1:
                First.dif_date();
                break;
            case 2:
                Second.get_day();
                break;
            case 3:
                Third.comparison();
                break;
            default:
                System.out.print("Введён некорректный номер");
        }
    }
}