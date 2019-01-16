import java.util.Scanner;

public class Sample {
    Sample(String s) {
        System.out.println("Inside the constructor: " + s + "\n");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter text\n");
        s = sc.next();

        Sample obj1 = new Sample(s);
    }
}
