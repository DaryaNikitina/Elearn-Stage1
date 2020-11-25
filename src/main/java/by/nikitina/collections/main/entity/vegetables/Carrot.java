package by.nikitina.collections.main.entity.vegetables;

import by.nikitina.collections.main.entity.categories.Roots;

public class Carrot extends Roots {
    public Carrot() {
        super("Carrot", 35);
    }

    public Carrot(double weight) {
        super("Carrot", 35, weight);
    }
}

