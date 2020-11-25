package by.nikitina.classes.action;

import by.nikitina.classes.entity.Customer;

import java.util.List;

public class CustomersOutput {
    public static void customersOutput(List<Customer> customers) {
        for (Customer elem : customers) {
            System.out.println(elem.toString());
        }
    }
}