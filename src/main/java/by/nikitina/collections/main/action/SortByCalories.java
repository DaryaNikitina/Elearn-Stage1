package by.nikitina.collections.main.action;

import by.nikitina.collections.main.entity.Vegetable;

import java.util.Comparator;

public class SortByCalories implements Comparator<Vegetable> {

    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        return (int)(o1.getVegetableCalories() - (o2.getVegetableCalories()));
    }
}
        
