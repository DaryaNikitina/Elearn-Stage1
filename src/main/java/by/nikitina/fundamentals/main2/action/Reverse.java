package by.nikitina.fundamentals.main2.action;

public class Reverse {
    public static void reverse(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}
