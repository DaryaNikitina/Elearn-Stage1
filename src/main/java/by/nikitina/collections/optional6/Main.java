package by.nikitina.collections.optional6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(
                    "D:/ELearn/src/main/resources/Data6"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> strings = new ArrayList<>();
        while (scanner.hasNextLine()) {
            strings.add(scanner.nextLine());
        }
        Collections.sort(strings);
        System.out.println(strings);
    }
}
