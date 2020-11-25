package by.nikitina.fundamentals.optional1;

import by.nikitina.fundamentals.optional1.action.DefineLength;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[]arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.next();
        }
        DefineLength.define(arr);
    }
}
