package by.nikitina.collections.main.action;

import by.nikitina.collections.main.entity.Vegetable;

import java.util.Comparator;

public class SortByWeight implements Comparator<Vegetable> {

    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        return (int)(o1.getVegetableWeight() - (o2.getVegetableWeight()));
    }
}