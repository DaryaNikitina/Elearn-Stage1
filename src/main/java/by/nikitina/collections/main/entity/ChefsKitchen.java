package by.nikitina.collections.main.entity;

import by.nikitina.collections.main.action.ShowSaladRecipe;
import by.nikitina.collections.main.action.ShowVegetablesByCalories;
import by.nikitina.collections.main.action.VegetableCreator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChefsKitchen {
    private Salad salad;

    public ChefsKitchen(Salad salad) {
        this.salad = salad;
    }

    public ChefsKitchen() {
        salad = new Salad();
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        Vegetable vegetable = null;

        System.out.println("Choose what you want from the menu");

        while (choice != 0) {
            System.out.println("1. Name the salad");
            System.out.println("2. Add ingredient");
            System.out.println("3. Show recipe");
            System.out.println("4. Sort ingredients by calories");
            System.out.println("5. Sort ingredients by weight");
            System.out.println("6. Get ingredients for calories");
            System.out.println("0. Exit");

            try {
                choice = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Wrong option!");
                scanner.next();
                choice = -1;
            }

            switch(choice) {
                case 1:
                    System.out.println("Name your salad:");
                    salad.setSaladName(scanner.next());
                    break;

                case 2:
                    vegetable = VegetableCreator.getVegetable(scanner);
                    if (vegetable != null) {
                        if (!salad.addVegetables(vegetable)) {
                            System.out.println("Can't add this vegetable!");
                        }
                    }
                    break;

                case 3:
                    ShowSaladRecipe.showRecipe(salad.getVegetables(), salad);
                    break;

                case 4:
                    salad.sortVegetablesByCalories();
                    break;

                case 5:
                    salad.sortVegetablesByWeight();
                    break;

                case 6:
                    ShowVegetablesByCalories.sortVegetablesByCalories(
                            salad.getVegetables(), scanner);
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }

        scanner.close();
    }
}
