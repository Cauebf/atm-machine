public class AtmOperationImpl implements AtmOperationInterf {

    ATM atm = new ATM();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: " + atm.getBalance());
    }

    @Override
    public void withDrawnAmount(double withdrawAmount) {
        if (withdrawAmount > atm.getBalance()) {
            System.out.println("Insufficient Balance !!");
            return;
        }

        System.out.println("Collect the Cash " + withdrawAmount);
        atm.setBalance(atm.getBalance() - withdrawAmount); // current balance - withdraw amount
        viewBalance();
    }

    @Override
    public void depositAmount(double depositAmount) {
        atm.setBalance(atm.getBalance() + depositAmount); // current balance + deposited amount
        System.out.println(depositAmount + " Deposited Successfully!!");
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {

    }
}
