package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите номер задания (1, 2, 3): ");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        switch (in){
            case 1:
                a.hello();
                break;
            case 2:
                b.calculator();
                break;
            case 3:
                c.full_name();
                break;
            default:
                System.out.print("Введён некорректный номер");
        }
    }
}