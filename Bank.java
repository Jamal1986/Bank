import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number");
        int accountNumber = input.nextInt();

        System.out.println("Enter initial balance");
        double initialBalance = input.nextDouble();

        System.out.println("Enter a pin");
        int pin = input.nextInt(); //pin should be 1234
        if (pin != 1234) {
            do {
                System.out.println("Wrong pin number, please enter the right pin number!");
                pin = input.nextInt();
            } while (pin != 1234);


            System.out.println("Amount to be deposited");
            double depositAmount = input.nextDouble();
            double newBalance = initialBalance + depositAmount;
            System.out.println("Deposited! Account Balance : " + newBalance);

            System.out.println("Amount to be withdrawn");
            double withdrawnAmount = input.nextDouble();
            if (newBalance - withdrawnAmount < 0.0) {
                System.out.println("You don't have enough money !!");
            } else {
                System.out.println("Amount withdrawn! Available Balance : " + (newBalance - withdrawnAmount));
            }

        }
    }
}
