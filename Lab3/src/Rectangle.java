import java.util.Scanner;

public class Rectangle {
    double width, length, area;
    String color;

    void setWidth(double w) {
        this.width = w;
    }
    void setLength(double l) {
        this.length = l;
    }
    double find_Area() {
        this.area = this.width * this.length;
        return this.area;
    }
    void setColor(String col) {
        this.color = col;
    }

    public static void main(String[] args) {
        System.out.println("Enter width, length, area, color");
        Scanner reader = new Scanner(System.in);
        double w, l;
        String col;
        w = reader.nextDouble();
        l = reader.nextDouble();

        col = reader.nextLine();

        Rectangle R1 = new Rectangle();
        R1.setLength(l);
        R1.setWidth(w);
        R1.setColor(col);

        System.out.println("the area of the rectangle is " + R1.find_Area() + " with color " + R1.color);
    }
}
