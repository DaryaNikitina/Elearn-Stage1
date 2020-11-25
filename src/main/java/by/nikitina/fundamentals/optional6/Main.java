package by.nikitina.fundamentals.optional6;

import by.nikitina.fundamentals.optional6.action.IncreaseNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] number = new String[size];
        for (int i = 0; i < size; i++) {
            number[i] = scanner.next();
        }
        scanner.close();
        IncreaseNumbers.showIncreaseNumber(number);
    }
}
