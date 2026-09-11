public class UseCase4{
    public static void main(String[] args) {
        double balance = 5000.0;
        double withdrawAmount = 7500.0;
        try {
            withdraw(balance, withdrawAmount);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Transaction attempt completed.");
        }
    }

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Balance is insufficient");
        }

        System.out.println("Withdrawl Successful"+(balance-amount));
    }
}
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}
