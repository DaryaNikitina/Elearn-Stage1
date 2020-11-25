package by.nikitina.fundamentals.main3.action;

import java.util.Random;

public class RandomNumbers {
    public static void fulfilArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(300);
        }
    }
}
