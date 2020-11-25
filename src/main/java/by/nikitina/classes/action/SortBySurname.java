package by.nikitina.classes.action;

import by.nikitina.classes.entity.Customer;

import java.util.Comparator;

public class SortBySurname implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
