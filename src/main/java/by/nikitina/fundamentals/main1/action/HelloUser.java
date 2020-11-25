package by.nikitina.fundamentals.main1.action;

public class HelloUser {
    public static String message(String userName) {
        String str = " Hello, ";
        if (userName != null) {
            str += userName;
        } else {
            str += "Anonim";
        }
        return str;
    }
}
