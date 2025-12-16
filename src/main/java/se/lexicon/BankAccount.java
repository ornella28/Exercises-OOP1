package se.lexicon;

public class BankAccount {


    private String accountHolder;
    private double balance;
    private String address;
    private String phoneNumber;
    private String accountType;


//Creating a method responsible for returning the account information

    public String getAccountInfo(){
        return "Account holder: " + accountHolder + ", Balance: " + balance + ", Address: " + address + ", Phone Number: " + phoneNumber + ", Account Type: " + accountType;
    }


    //Creating method deposit and withdraw to update the balance field

    public void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }

    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            this.balance -= amount;
        } else {
            throw new IllegalArgumentException("Withdraw amount must be positive and less than or equal to the balance");
        }
    }

    //Generating setters for accountHolder, address and phoneNumber to update the values of the private fields

    public void setAccountHolder(String accountHolder) {
        if (accountHolder==null || accountHolder.trim().isEmpty()){
            throw new IllegalArgumentException("Account holder name cannot be null or empty");
        }
        this.accountHolder = accountHolder;
    }

    public void setAddress(String address) {
        if (address==null || address.trim().isEmpty()){
            throw new IllegalArgumentException("Address cannot be null or empty");
        }
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber==null || phoneNumber.trim().isEmpty()){
            throw new IllegalArgumentException("Phone number must be positive");
        }
        this.phoneNumber = phoneNumber;
    }
}
