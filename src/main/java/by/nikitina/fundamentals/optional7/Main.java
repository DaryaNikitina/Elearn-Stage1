package by.nikitina.fundamentals.optional7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] number = new String[size];
        for (int i = 0; i < size; i++) {
            number[i] = scanner.next();
        }
        printNumberWithDiffDigits(number);
        scanner.close();
    }

    public static boolean isDigitsDifferent(String number) {
        if (number.length() < 2) {
            return false;
        }
        for (int i = 0; i < number.length() - 1; i++) {
            for (int j = 1; j < number.length(); j++) {
                if (number.charAt(i) == number.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printNumberWithDiffDigits(String[] array) {
        for (String s : array) {
            if (isDigitsDifferent(s)) {
                System.out.println(s);
                break;
            }
        }
    }
}
