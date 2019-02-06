import java.util.ArrayList;
import java.util.Scanner;

public class DerivedCustomer extends CustomerData {

    ArrayList <Integer> ageList;
    Integer age;

    public DerivedCustomer(String passengerName, String startDate, String placeVisited, String dateOfReturn, Integer age) {
        super(passengerName, startDate, placeVisited, dateOfReturn);
        this.age = age;
        updateAge();
    }

    DerivedCustomer() {

    }

    void updateAge() {
        System.out.println("Enter Age: ");
        Scanner scan = new Scanner(System.in);
        this.age = scan.nextInt();
        ageList.add(age);
    }

    void displayAge() {
        System.out.println(" age: " + this.age + "\n");
    }

    void displayChildren() {
        for(int i=0;i<passengerList.size();++i){
            if(ageList.get(i) < 12) {
                System.out.println("\nname: " + passengerList.get(i).passengerName + " startDate: " + passengerList.get(i).startDate + " placeVisited " + passengerList.get(i).placeVisited + " dateofReturn " + passengerList.get(i).dateOfReturn +"\n");
            }
        }
    }
}
