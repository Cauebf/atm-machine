import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AtmOperationInterf op = new AtmOperationImpl();
        int atmNumber = 12345;
        int atmPin = 123;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to ATM Machine !!!");
        System.out.print("Enter Atm Number: ");
        int inputNumber = scanner.nextInt();
        System.out.print("Enter pin: ");
        int inputPin = scanner.nextInt();

        if ((atmNumber != inputNumber) || (atmPin != inputPin)) {
            System.out.println("Incorrect Atm Number or Pin");
            System.exit(1);
        }

        while (true) {
            System.out.println("\n*************************");
            System.out.print(
                    "1.View Available Balance\n" +
                    "2.Withdraw Amount\n" +
                    "3.Deposit Amount\n" +
                    "4.View MiniStatement\n" +
                    "5.Exit"
            );
            System.out.println("\n*************************");
            System.out.print("Enter Choice: ");
            int response = scanner.nextInt();

            switch (response) {
                case 1:
                    op.viewBalance();
                    break;
                case 2:
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    op.withDrawnAmount(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmount = scanner.nextDouble();
                    op.depositAmount(depositAmount);
                    break;
                case 4:
                    op.viewMiniStatement();
                    break;
                case 5:
                    System.out.println("Collect your ATM Card\nThank you for using ATM Machine!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not a valid answer!");
            }
        }
    }
}
