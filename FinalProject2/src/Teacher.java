import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Teacher extends User implements TeacherInterface{
    String name;
    Map<Book, Date> books;
    double fine;

    public Teacher(String name, Map<Book, Date> books, double fine) {
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

    @Override
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
