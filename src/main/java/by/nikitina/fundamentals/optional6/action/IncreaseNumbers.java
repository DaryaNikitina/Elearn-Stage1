package by.nikitina.fundamentals.optional6.action;

public class IncreaseNumbers {
    private static boolean isDigitsIncreases(String number) {
        boolean flag = false;
        char firstChar = number.charAt(0);
        int firstCharInt = firstChar - '0';
        String n = "123456789";
        String result = n.substring(firstCharInt - 1);
        if (number.length() < 2) {
            return false;
        }
        for (int i = 0; i < number.length(); i++) {
            flag = number.charAt(i) == result.charAt(i);
        }
        return flag;
    }

    public static void showIncreaseNumber(String[] array) {
        for (String s : array) {
            if (isDigitsIncreases(s)) {
                System.out.println(s);
                break;
            }
        }
    }
}

