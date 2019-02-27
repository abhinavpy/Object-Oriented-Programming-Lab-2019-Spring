import java.util.Scanner;

public class TestRBI {
    public static void main(String args[]) {
        int initialAmount;
        int interest;

        System.out.println("Enter 1 to create SBI account , 2 to create ICICI account\n");

        Scanner scan = new Scanner(System.in);

        int option = scan.nextInt();

        if(option == 1) {
            System.out.println("enter intial amount and interest");
            initialAmount = scan.nextInt();
            interest = scan.nextInt();
            SBI newAccount1 = new SBI(initialAmount, interest);
            System.out.println("Make a withdrawal:");
            int withdrawal;
            withdrawal = scan.nextInt();
            newAccount1.makeWithdrawal(withdrawal);
        }

        if(option == 2) {
            System.out.println("enter intial amount and interest");
            initialAmount = scan.nextInt();
            interest = scan.nextInt();
            ICICI newAccount2 = new ICICI(initialAmount, interest);
            System.out.println("Make a withdrawal:");
            int withdrawal;
            withdrawal = scan.nextInt();
            newAccount2.makeWithdrawal(withdrawal);
        }
    }
}
