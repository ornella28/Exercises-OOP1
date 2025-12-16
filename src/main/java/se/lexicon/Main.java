package se.lexicon;

public class Main {


     void main() {
         //ClassName referenceName = new ClassName();
        BankAccount bankAccount = new BankAccount("John Doe", "123 Main St, Anytown, USA" , "0720256233");//Calling the setter i created in the BankAccount class for updating the accountHolder field
       /* bankAccount.setAccountHolder("John Doe");//Setting the account holder name
        bankAccount.setAddress("123 Main St, Anytown, USA");//Setting the address
        bankAccount.setPhoneNumber("0720256233");//Setting the phone number*/

         //BankAccount bankAccount2 = new BankAccount("Jane Smith", "456 Oak St, Othertown, USA", "0733344556");

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

       Customer john = new Customer(1, "John Doe", "johndoe@gmail.com", java.time.LocalDate.of(1990, 5, 15));// calling the constructor to create a new Customer object
         System.out.println(john.toString());//Printing the customer information using the overridden toString method

         Student student = new Student(1, "Alice Johnson", 20, "Computer Science");// calling the constructor to create a new Student object
         System.out.println(student.toString());

         Student alicia = new Student(2, "Alicia Keys", 22, "Music");// calling the constructor to create a new Student object
            System.out.println(alicia.toString());

            Product product = new Product(1, "Laptop", 999.99, 10);// calling the constructor to create a new Product object
            System.out.println(product.toString());

            Product phone = new Product(2, "Smartphone", 699.99, 20);// calling the constructor to create a new Product object
            System.out.println(phone.toString());

            //Create products
            Product laptop = new Product(1, "Laptop", 999.99, 8);
            Product smartphone = new Product(2, "Smartphone", 699.99, 15);

            //Create first order
            Order order1 = new Order(1, "john", new java.util.ArrayList<>(), java.time.LocalDateTime.now());
            order1.addProduct(laptop);

            //Create second order
            Order order2 = new Order(2, "alice", new java.util.ArrayList<>(), java.time.LocalDateTime.now());
            order2.addProduct(smartphone);

         System.out.println("Order" + order1.getOrderId() + " placed by " + order1.getCustomerName() + " on " + order1.getOrderDate());
         System.out.println("Order" + order2.getOrderId() + " placed by " + order2.getCustomerName() + " on " + order2.getOrderDate());



















    }
}
