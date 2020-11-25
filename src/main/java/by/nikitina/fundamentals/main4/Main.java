package by.nikitina.fundamentals.main4;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int multiply = 1;
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
            multiply = multiply * Integer.parseInt(args[i]);
        }
        System.out.println("Sum is " + sum);
        System.out.println("Multiply is "+ multiply);
    }
}
