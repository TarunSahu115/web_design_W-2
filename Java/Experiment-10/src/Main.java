public class Main {

    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount(101, "Abhay Gupta", 1000000);

        CurrentAccount current =
                new CurrentAccount(201, "Rahul Sharma", 20000);

        System.out.println("=== Savings Account ===");
        savings.deposit(5000);
        savings.displayDetails();
        System.out.println("Interest: " + savings.calculateInterest());

        System.out.println();

        System.out.println("=== Current Account ===");
        current.deposit(3000);
        current.displayDetails(); 
        System.out.println("Interest: " + current.calculateInterest());
    }
}