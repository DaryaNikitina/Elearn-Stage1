package by.nikitina.collections.main.entity.categories;

import by.nikitina.collections.main.entity.Vegetable;

public abstract class Roots extends Vegetable {
    public Roots(String name, double calories) {
        super(name, calories);
        setCategory("Root vegetables");
    }

    public Roots(String name, double calories, double weight) {
        super(name, calories, weight);
        setCategory("Root vegetables");
    }
}
