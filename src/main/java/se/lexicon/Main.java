package se.lexicon;

public class Main {


     void main() {
         //ClassName referenceName = new ClassName();
        BankAccount bankAccount = new BankAccount();//Calling the setter i created in the BankAccount class for updating the accountHolder field
        bankAccount.setAccountHolder("John Doe");//Setting the account holder name

        System.out.println(bankAccount.getAccountInfo());//Calling the method that returns the account information










    }
}
