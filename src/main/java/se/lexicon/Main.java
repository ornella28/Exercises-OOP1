package se.lexicon;

public class Main {


     void main() {
         //ClassName referenceName = new ClassName();
        BankAccount bankAccount = new BankAccount("John Doe", "123 Main St, Anytown, USA" , "0720256233");//Calling the setter i created in the BankAccount class for updating the accountHolder field
       /* bankAccount.setAccountHolder("John Doe");//Setting the account holder name
        bankAccount.setAddress("123 Main St, Anytown, USA");//Setting the address
        bankAccount.setPhoneNumber("0720256233");//Setting the phone number*/

         bankAccount.deposit(5000);//Depositing an amount to the balance field
         System.out.println(bankAccount.getAccountInfo());

         bankAccount.deposit(1500);//Depositing another amount to the balance field
         System.out.println(bankAccount.getAccountInfo());//Calling the method that returns the account information

         bankAccount.withdraw(1000);//Withdrawing an amount from the balance field
         System.out.println(bankAccount.getAccountInfo());//Calling the method that returns the account information

         bankAccount.setAccountHolder("Jane Smith");//Updating the account holder name using the setter method
         bankAccount.setAddress("456 Oak St, Othertown, USA");//Updating the address using the setter method
         bankAccount.setPhoneNumber("0733344556");//Updating the phone number using the setter method
         System.out.println(bankAccount.getAccountInfo());//Calling the method that returns the account information after updates

         System.out.println("The balance is: " + bankAccount.getBalance());//Getting the current balance using the getter method















    }
}
