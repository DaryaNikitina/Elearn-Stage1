package by.nikitina.collections.main.entity.vegetables;

import by.nikitina.collections.main.entity.categories.Cereals;

public class Corn extends Cereals {
    public Corn() {
        super("Corn", 123);
    }

    public Corn(double weight) {
        super("Corn", 123, weight);
    }
}
