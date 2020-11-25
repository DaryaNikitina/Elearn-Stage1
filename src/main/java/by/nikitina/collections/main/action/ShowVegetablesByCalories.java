package by.nikitina.collections.main.action;

import by.nikitina.collections.main.entity.Vegetable;

import java.util.List;
import java.util.Scanner;

public class ShowVegetablesByCalories {
    public static void sortVegetablesByCalories (
            List<Vegetable> vegetables, Scanner scanner) {
        int leftScope = scanner.nextInt();
        int rightScope = scanner.nextInt();
        int var;
        if (leftScope > rightScope) {
            var = leftScope;
            leftScope = rightScope;
            rightScope = var;
        }
        for (Vegetable vegetable: vegetables) {
            if (vegetable.getVegetableCalories() >= leftScope
                    && vegetable.getVegetableCalories() <= rightScope) {
                System.out.println("Name is " + vegetable.getVegetableName()
                        + " with calories " + vegetable.getVegetableCalories());
            }
        }
    }
}
