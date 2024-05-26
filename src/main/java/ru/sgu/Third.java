package src.main.java.ru.sgu;

import java.util.UUID;

public class Third {
    public static final int REPEAT = 100000;
    public static final int LENGTH_STRING = 10;

    public static void comparison() {
        typeString();
        typeStringBuilder();
        typeStringBuffer();

    };

    public static void typeString() {
        String str = "";
        long startTime = System.nanoTime();
        for (int i = 0; i < REPEAT; i++) str += generateRandomString();
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    public static void typeStringBuilder() {
        StringBuilder str = new StringBuilder();
        long startTime = System.nanoTime();
        for (int i = 0; i < REPEAT; i++) str.append(generateRandomString());
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    public static void typeStringBuffer() {
        StringBuffer str = new StringBuffer();
        long startTime = System.nanoTime();
        for (int i = 0; i < REPEAT; i++) str.append(generateRandomString());
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);

    }

    public static String generateRandomString() {
        UUID randomUUID = UUID.randomUUID();
        String randomString = randomUUID.toString();
        return randomString.substring(0, LENGTH_STRING);
    }
}
