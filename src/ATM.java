public class ATM {
    private double balance;
    private double depositAmount;
    private double withDrawAmount;

    // default constructor
    public ATM() {}

    // getter setter
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithDrawAmount() {
        return withDrawAmount;
    }

    public void setWithDrawAmount(double withDrawAmount) {
        this.withDrawAmount = withDrawAmount;
    }
}
