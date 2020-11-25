package by.nikitina.collections.main.action;

import by.nikitina.collections.main.entity.Vegetable;

import java.lang.reflect.Constructor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VegetableCreator {
    public static Vegetable getVegetable(Scanner scanner) {
        String vegetableName;
        double weight;

        System.out.println("Enter the vegetable name:");
        vegetableName = scanner.next();

        System.out.println("Enter the weight (in gramms):");

        try {
            weight = scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong weight!");
            scanner.next();

            return null;
        }

        try {
            Class [] parameters = {double.class};
            vegetableName = "by.nikitina.CollectionsMainTask.entity.vegetables." + vegetableName;
            Class vegetableClass = Class.forName(vegetableName);
            Constructor constructor =
                    vegetableClass.getDeclaredConstructor(parameters);
            Vegetable vegetable = (Vegetable) constructor.newInstance(
                    new Object[]{new Double(weight)});

            return vegetable;
        }
        catch (Exception e) {
            System.out.println("No such vegetable!");
            return null;
        }
    }
}
