package by.nikitina.collections.main.entity;

import by.nikitina.collections.main.action.SortByCalories;
import by.nikitina.collections.main.action.SortByWeight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salad {
    private String saladName;
    private List<Vegetable> vegetables = new ArrayList<Vegetable>();

    public Salad() {
        saladName = "Vegetable";
    }

    public Salad(String saladName) {
        this.saladName = saladName;
    }

    public String getSaladName() {
        return saladName;
    }

    public void setSaladName(String saladName) {
        this.saladName = saladName;
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public boolean addVegetables(Vegetable vegetable) {
        return vegetables.add(vegetable);
    }

    public double countTotalCalories() {
        double calories = 0.0;
        for (Vegetable vegetable : vegetables) {
            calories += vegetable.getTotalCalories();
        }
        return calories;
    }

    public void sortVegetablesByCalories() {
        Collections.sort(vegetables, new SortByCalories());
    }
    public void sortVegetablesByWeight() {
        Collections.sort(vegetables, new SortByWeight());
    }

}
