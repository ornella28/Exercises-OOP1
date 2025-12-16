package se.lexicon;

public class BankAccount {


    private String accountHolder;
    private double balance;
    private String address;
    private double phoneNumber;
    private String accountType;


//Creating a method responsible for returning the account information

    public String getAccountInfo(){
        return "Account holder: " + accountHolder + ", Balance: " + balance + ", Address: " + address + ", Phone Number: " + phoneNumber + ", Account Type: " + accountType;
    }

    //Generating setters for accountHolder, address and phoneNumber to update the values of the private fields

    public void setAccountHolder(String accountHolder) {
        if (accountHolder==null || accountHolder.trim().isEmpty()){
            throw new IllegalArgumentException("Account holder name cannot be null or empty");
        }
        this.accountHolder = accountHolder;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
