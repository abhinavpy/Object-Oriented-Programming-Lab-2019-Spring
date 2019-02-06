import java.util.ArrayList;
import java.util.Scanner;

public class CustomerData {

    ArrayList<CustomerData> passengerList;

    String passengerName;
    String startDate;
    String placeVisited;
    String dateOfReturn;

    CustomerData(String passengerName, String startDate, String placeVisited, String dateOfReturn) {
        this.passengerName = passengerName;
        this.startDate = startDate;
        this.placeVisited = placeVisited;
        this.dateOfReturn = dateOfReturn;
    }

    CustomerData() {

    }

    void createCustomerData(String pname, String sdate, String pVis, String dRet) {
        CustomerData passenger = new CustomerData(pname,sdate,pVis,dRet);
        passengerList.add(passenger);
    }

    void displayDatabase() {
        for(int i=0;i<passengerList.size();++i) {
            System.out.println("\nname: " + passengerList.get(i).passengerName +
                    " startDate: " + passengerList.get(i).startDate +
                    " placeVisited: " + passengerList.get(i).placeVisited +
                    " dateofReturn: " + passengerList.get(i).dateOfReturn +"\n");
        }
    }
}
