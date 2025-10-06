import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
            System.out.println(
                    "1.View Available Balance\n" +
                    "2.Withdraw Amount\n" +
                    "3.Deposit Amount\n" +
                    "4.View Ministatement\n" +
                    "5.Exit"
            );
            System.out.println("Enter Choice : ");
            int response = scanner.nextInt();

            switch (response) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not a valid answer!");
            }
        }
    }
}
