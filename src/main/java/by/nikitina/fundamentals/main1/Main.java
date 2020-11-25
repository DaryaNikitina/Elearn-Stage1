package by.nikitina.fundamentals.main1;

import by.nikitina.fundamentals.main1.action.HelloUser;

public class Main {
    public static void main(String[] args) {
        String userName = null;
        if (args.length !=0) {
            userName = args[0];
        }
        String str = HelloUser.message(userName);
        System.out.println(str);
    }
}


