package by.nikitina.collections.main.entity.categories;

import by.nikitina.collections.main.entity.Vegetable;

public abstract class Cereals extends Vegetable {
    public Cereals(String name, double calories) {
        super(name, calories);
        setCategory("Cereal vegetables");
    }

    public Cereals(String name, double calories, double weight) {
        super(name, calories, weight);
        setCategory("Cereal vegetables");
    }
}
