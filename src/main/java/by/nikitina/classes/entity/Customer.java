package by.nikitina.classes.entity;

import java.util.Objects;

public class Customer {
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private int id;
    private static int counter = 1;
    private int creditCardNumber;
    private int bankAccountNumber;


    public Customer ( String name, String surname, String patronymic, String address, int creditCardNumber, int bankAccountNumber) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        id = counter++;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public Customer (int creditCardNumber, int bankAccountNumber) {
        this.name = "David";
        this.surname = "Davidov";
        this.patronymic = "Davidovich";
        this.address = "Belarus";
        id = counter++;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                creditCardNumber == customer.creditCardNumber &&
                bankAccountNumber == customer.bankAccountNumber &&
                name.equals(customer.name) &&
                surname.equals(customer.surname) &&
                patronymic.equals(customer.patronymic) &&
                address.equals(customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, address, id, creditCardNumber, bankAccountNumber);
    }
}

