package by.nikitina.fundamentals.main0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        double D;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Roots of the equation: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("There is one root: x = " + x);
        }
        else {
            System.out.println("There is no roots");
        }
    }
}
