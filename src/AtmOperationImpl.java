import java.util.HashMap;
import java.util.Map;

// implementation of the ATM operations interface
public class AtmOperationImpl implements AtmOperationInterf {

    ATM atm = new ATM();
    Map<Double, String> ministmt = new HashMap<>(); // Stores transaction history

    @Override
    public void viewBalance() {
        // displays the current balance
        System.out.println("Available Balance is: " + atm.getBalance());
    }

    @Override
    public void withDrawnAmount(double withdrawAmount) {
        // only allows withdrawal in multiples of 500
        if (withdrawAmount % 500 != 0) {
            System.out.println("Please enter the amount in multiples of 500");
            return;
        }

        // check if balance is sufficient
        if (withdrawAmount > atm.getBalance()) {
            System.out.println("Insufficient Balance !!");
            return;
        }

        // record withdrawal in transaction history
        ministmt.put(withdrawAmount, "Amount Withdrawn");

        // reduce balance and display confirmation
        System.out.println("Collect the Cash " + withdrawAmount);
        atm.setBalance(atm.getBalance() - withdrawAmount); // current balance - withdraw amount
        viewBalance();
    }

    @Override
    public void depositAmount(double depositAmount) {
        // record deposit in transaction history
        ministmt.put(depositAmount, "Amount Deposited");

        // increase balance and display confirmation
        atm.setBalance(atm.getBalance() + depositAmount); // current balance + deposited amount
        System.out.println(depositAmount + " Deposited Successfully!!");
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        // iterate and print all transactions
        for (Map.Entry<Double, String> m : ministmt.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
