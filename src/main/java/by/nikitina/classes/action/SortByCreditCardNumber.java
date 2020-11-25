package by.nikitina.classes.action;

import by.nikitina.classes.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class SortByCreditCardNumber {
    public static List<Customer> sortCreditCardNumber(List<Customer> customers, int leftScope, int rightScope) {
        List<Customer> result = new ArrayList<>();
        int var;
        if (leftScope > rightScope) {
            var = leftScope;
            leftScope = rightScope;
            rightScope = var;
        }
        for (Customer customer: customers) {
            if (customer.getCreditCardNumber() >= leftScope && customer.getCreditCardNumber() <= rightScope) {
                result.add(customer);
            }
        }
            return result;
    }
}
