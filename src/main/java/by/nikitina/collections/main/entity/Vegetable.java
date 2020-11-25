package by.nikitina.collections.main.entity;

public class Vegetable {
    private String vegetableName;
    private double vegetableCalories;
    private double vegetableWeight;
    private String category;

    public Vegetable(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    public Vegetable(String vegetableName, double vegetableCalories) {
        if (vegetableCalories < 0) {
            throw new IllegalArgumentException("Can't create vegetable with "
                    + vegetableCalories + " kcal");
        }

        this.vegetableName = vegetableName;
        this.vegetableCalories = vegetableCalories;
        this.vegetableWeight = 100;
    }

    public Vegetable(String vegetableName, double vegetableCalories, double vegetableWeight) {
        if (vegetableCalories < 0) {
            throw new IllegalArgumentException("Can't create vegetable with "
                    + vegetableCalories + " kcal");
        }

        if (vegetableWeight <= 0) {
            throw new IllegalArgumentException("Can't create vegetable with " + vegetableWeight
                    + " of " + vegetableName);
        }

        this.vegetableName = vegetableName;
        this.vegetableCalories = vegetableCalories;
        this.vegetableWeight = vegetableWeight;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    public double getVegetableCalories() {
        return vegetableCalories;
    }

    public void setVegetableCalories(double vegetableCalories) {
        this.vegetableCalories = vegetableCalories;
    }

    public double getTotalCalories() {
        return vegetableCalories * vegetableWeight / 100.0;
    }

    public double getVegetableWeight() {
        return vegetableWeight;
    }

    public void setVegetableWeight(double vegetableWeight) {
        this.vegetableWeight = vegetableWeight;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Vegetable "
                 + vegetableName +
                " with " + vegetableCalories + " calories" +
                " and " + vegetableWeight + " grams " +
                " belongs to " + category + " category";
    }
}