import java.util.ArrayList;
import java.util.Scanner;

public class sortNames {

    public static void main(String args[]) {
       System.out.println("Enter the number of names\n");
       int n;
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();

       String[] names = new String[n];

       String s = new String();

       System.out.println("Enter " + n + " strings into the list of names\n");

       for(int i=0;i<n;++i) {
           s = sc.next();
           names[i] = s;
       }

       System.out.println("Enter 1 if user wants to sort names in ascending order\nelse 0\n");

       int check;
       check = sc.nextInt();

       //Sort in ascending order
       if(check == 1) {
           for(int i=0;i<n-1;++i) {
               for(int j=i+1;j<n;++j) {
                   if(names[i].compareTo(names[j]) > 0) {
                       String temp = names[i];
                       names[i] = names[j];
                       names[j] = temp;
                   }
               }
           }
       }

       //Sort in descending order
       else {
           for(int i=0;i<n-1;++i) {
               for(int j=0;j<n;++j) {
                   if(names[i].compareTo(names[j]) < 0) {
                       String temp = names[i];
                       names[i] = names[j];
                       names[j] = temp;
                   }
               }
           }
       }

       System.out.println("The list of names are:\n");

       for(int i=0;i<n;++i) {
           System.out.println(names[i]);
       }

    }
}
