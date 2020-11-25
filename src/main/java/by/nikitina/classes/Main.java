package by.nikitina.classes;

import by.nikitina.classes.action.SortByCreditCardNumber;
import by.nikitina.classes.entity.Customer;
import by.nikitina.classes.action.CustomersOutput;
import by.nikitina.classes.action.SortByName;
import by.nikitina.classes.action.SortBySurname;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>(Arrays.asList(
                new Customer("Oleg","Lsp","Valdic","Paris", 1, 5),
                new Customer("Ivan","Ivanov","Ivanovich","Oslo", 23, 45),
                new Customer("Vero","Nika","Chika","NewYork", 4, 75)
        ));
        Collections.sort(customers, new SortBySurname());
        CustomersOutput.customersOutput(customers);
        Collections.sort(customers, new SortByName());
        CustomersOutput.customersOutput(customers);

        List<Customer> customersWithApprovedCards = SortByCreditCardNumber.sortCreditCardNumber(customers, 8,2);
        CustomersOutput.customersOutput(customersWithApprovedCards);
    }

}
