import java.util.Scanner;

public class Student {
    int rollno;
    String name;

    int marks1, marks2, marks3;

    Student() {
        System.out.println("Null constructor called\n");
    }

    public void display() {
        System.out.println("Rollno" + rollno);
        System.out.println("Name" + name);
        System.out.println("marks1" + marks1);
        System.out.println("marks2" + marks2);
        System.out.println("marks3" + marks3);
    }

    public static void main(String[] args) {
        Student a1 = new Student();
        System.out.println("enter  roolno, name, marks 1, 2, 3\n");
        Scanner reader = new Scanner(System.in);

        a1.rollno = reader.nextInt();
        a1.name = reader.nextLine();
        a1.marks1 = reader.nextInt();
        a1.marks2 = reader.nextInt();
        a1.marks3 = reader.nextInt();

        a1.display();
    }
}
