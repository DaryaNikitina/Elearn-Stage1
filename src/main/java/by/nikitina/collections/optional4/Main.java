package by.nikitina.collections.optional4;

import by.nikitina.collections.optional4.action.LengthComparator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(
                    "D:/ELearn/src/main/resources/Data4"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNextLine()) {
            strings.push(scanner.nextLine());
        }

        Collections.sort(strings, new LengthComparator());
        System.out.println(strings);
    }
}
