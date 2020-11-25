package by.nikitina.collections.main.action;

import by.nikitina.collections.main.entity.Salad;
import by.nikitina.collections.main.entity.Vegetable;

import java.util.List;

public class ShowSaladRecipe {
    public static void showRecipe (List<Vegetable> vegetables, Salad salad) {
        if (vegetables.isEmpty()) {
            System.out.println("You haven't added any vegetables yet!");
            return;
        }

        System.out.println( salad.getSaladName() + " salad "+ " consists of:");
        for (Vegetable vegetable : vegetables) {
            System.out.println(vegetable.toString());
        }
        System.out.println("----------------------------");
        System.out.println("Total energy is " + salad.countTotalCalories() + " kcal");
    }
}
