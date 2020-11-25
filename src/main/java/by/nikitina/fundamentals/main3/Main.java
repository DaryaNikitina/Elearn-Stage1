package by.nikitina.fundamentals.main3;

import by.nikitina.fundamentals.main3.action.RandomNumbers;

public class Main {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        int[] array = new int[size];
        RandomNumbers.fulfilArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


