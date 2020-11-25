package by.nikitina.fundamentals.optional1.action;

public class DefineLength {
    public static void define(String[] arr) {
        int min = arr[0].length();
        int max = 0;
        for (String val : arr) {
            if (val.length() > max){
                max = val.length();
            }
            else if (val.length() < min){
                min = val.length();
            }
        }
        for (String s : arr) {
            if (s.length() == max)
                System.out.println("Number " + s + " with max length " + s.length());
            else if (s.length() == min)
                System.out.println("Number " + s + " with min length " + s.length());
        }
    }
}
