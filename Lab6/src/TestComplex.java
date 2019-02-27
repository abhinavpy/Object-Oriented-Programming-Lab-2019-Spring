import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args) {
        int real1, real2;
        int imaginary1, imaginary2;

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the real part and imaginary part of the first number: ");
        real1 = scan.nextInt();
        imaginary1 = scan.nextInt();
        Complex c1 = new Complex(real1, imaginary1);

        System.out.println("enter the real part and imaginary part of the second number: ");
        real2 = scan.nextInt();
        imaginary2 = scan.nextInt();
        Complex c2 = new Complex(real2, imaginary2);

        Complex c3 = new Complex(real1+real2, imaginary1+imaginary2);
        c3.display();
    }
}
