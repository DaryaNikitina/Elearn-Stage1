package by.nikitina.collections.optional1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(
                    new File("D:/ELearn/src/main/resources/Data"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Stack<String> strings = new Stack<>();

        while (scanner.hasNextLine()) {
            strings.push(scanner.nextLine());
        }

        while (!strings.empty()) {
            System.out.println(strings.pop());
        }
    }
}
