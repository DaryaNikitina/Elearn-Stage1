package by.nikitina.collections.main.entity.categories;

import by.nikitina.collections.main.entity.Vegetable;

public abstract class Tubers extends Vegetable {
    public Tubers(String name, double calories) {
        super (name, calories);
        setCategory("Tubers vegetables");
    }

    public Tubers(String name, double calories, double weight) {
        super(name, calories, weight);
        setCategory("Tubers vegetables");
    }
}
