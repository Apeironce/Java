package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class c {
    public static void full_name() {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String lines = reader.readLine();
            while (lines != null) {
                int correct = 0;
                String[] name = lines.split(" ", 4);
                lines = reader.readLine();
                if (name.length < 3) {
                    continue;
                }
                for (int i = 0; i < 3; ++i) {
                    if (!name[i].chars().allMatch(Character::isLetter)) {
                        correct = 1;
                        break;
                    }
                }
                if (correct == 1) {
                    continue;
                }
                System.out.printf("%s %s. %s.\n",
                        name[1], name[0].charAt(0), name[2].charAt(0));
            }
        } catch (IOException e) {
            System.out.println("Ошибка в чтении файла.\n" + e.getMessage());
        }
    }
}
