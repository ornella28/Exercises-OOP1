package se.lexicon;

public class Customer {

    private int customerId;
    private String name;
    private String email;


    //creating constructor to initialize the fields
    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }
}
