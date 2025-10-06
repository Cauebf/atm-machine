import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf {

    ATM atm = new ATM();
    Map<Double, String> ministmt = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: " + atm.getBalance());
    }

    @Override
    public void withDrawnAmount(double withdrawAmount) {
        if (withdrawAmount % 500 != 0) {
            System.out.println("Please enter the amount in multiples of 500");
            return;
        }

        if (withdrawAmount > atm.getBalance()) {
            System.out.println("Insufficient Balance !!");
            return;
        }

        ministmt.put(withdrawAmount, "Amount Withdrawn");
        System.out.println("Collect the Cash " + withdrawAmount);
        atm.setBalance(atm.getBalance() - withdrawAmount); // current balance - withdraw amount
        viewBalance();
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount, "Amount Deposited");
        atm.setBalance(atm.getBalance() + depositAmount); // current balance + deposited amount
        System.out.println(depositAmount + " Deposited Successfully!!");
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double, String> m : ministmt.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
