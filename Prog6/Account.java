package banking;

public class Account {
	private int accountNo;
    private String name;
    private double balance;

    public Account(int accountNo, String name, double Balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance =Balance;
    }
        public void deposit(double amt) throws ArithmeticException {
        	if (amt < 0) {
        		  throw new ArithmeticException("Deposit amt cannot be negative");
            }
            balance += amt;
            System.out.println("Deposited" + amt);
        	}

public void withdraw(double amt) throws InsufficientBalanceException, ArithmeticException {
    if (amt < 0) {
        throw new ArithmeticException("Withdrawal amt cannot be negative");
    }
    if (amt > balance) {
    	throw new InsufficientBalanceException("Insufficient balance Available" + balance);
    }
    balance -= amt;
    System.out.println("Withdrawn"+ amt);
}
public void showBalance() {
    System.out.println("Current Balance" + balance);
}
public String getAccountDetails() {
    return "Account No" + accountNo +"Name" + name;
}
}
       
