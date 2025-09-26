package banking;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(1001,"diti", 1000.00);
        System.out.println("Welcome, " + account.getAccountDetails());

        while (true) {
            System.out.println("\n Banking Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit:");
                        double depositAmt = scanner.nextDouble();
                        account.deposit(depositAmt);
                        break;

                    case 2:
                        System.out.print("Enter amt to withdraw:");
                        double withdrawAmt = scanner.nextDouble();
                        account.withdraw(withdrawAmt);
                        break;

                    case 3:
                        account.showBalance();
                        break;

                    case 4:
                        System.out.println("Thank you for using our banking system.");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please select 1-4");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values");
                scanner.nextLine(); 

            } catch (ArithmeticException e) {
                System.out.println("Error " + e.getMessage());

            } catch (InsufficientBalanceException e) {
                System.out.println("Error" + e.getMessage());
            }
        }
    }
}

	
