import java.util.Scanner;

public class TestTravelData {
    public static void main(String args[]) {
        System.out.println("Enter the number of customer to enter into the database: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        DerivedCustomer derivedCustomer = new DerivedCustomer();
        for(int i=0;i<n;++i) {
            System.out.println("Enter name, start date, place visited, date of return\n");
            String passengerName, startDate, placeVisited, dateOfReturn;
            passengerName = scanner.nextLine();
            startDate = scanner.nextLine();
            placeVisited = scanner.nextLine();
            dateOfReturn = scanner.nextLine();

            derivedCustomer.createCustomerData(passengerName, startDate, placeVisited, dateOfReturn);

        }


        derivedCustomer.displayDatabase();
    }
}
