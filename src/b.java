package src;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class b {
    public static void calculator() {
        BigDecimal a = new BigDecimal(0);
        BigDecimal b = new BigDecimal(0);
        String op = "";
        System.out.println("Введите данные:");
        Scanner input = new Scanner(System.in);
        try {
            a = new BigDecimal(input.next());
            b = new BigDecimal(input.next());
            op = input.next();
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        try {
            switch (op.toLowerCase()) {
                case "add":
                    System.out.printf("Ответ: %s", a.add(b));
                    break;
                case "div":
                    System.out.printf("Ответ: %s", a.divide(b, 2, RoundingMode.HALF_UP));
                    break;
                case "sub":
                    System.out.printf("Ответ: %s", a.subtract(b));
                    break;
                case "mult":
                    System.out.printf("Ответ: %s", a.multiply(b));
                    break;
                case "pow":
                    System.out.printf("Ответ: %s", a.pow(b.intValue()));
                    break;
                case "rem":
                    System.out.printf("Ответ: %s", a.remainder(b));
                    break;
                default:
                    System.out.println("Введена неверная команда");
                    break;
            }
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
