import java.util.Date;
import java.util.Map;

public class Student {
    String name;
    Map<Book, Date> books;
    double fine;


    public Student(String name, Map<Book, Date> books, double fine) {
        this.name = name;
        this.books = books;
        this.fine = fine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Book, Date> getBooks() {
        return books;
    }

    public void setBooks(Map<Book, Date> books) {
        this.books = books;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }
}
