import java.util.Date;
import java.util.Map;

interface StudentInterface {
    public String getName();
    public void setName(String name);

    public Map<Book, Date> getBooks();

    public void setBooks(Map<Book, Date> books);

    public double getFine();

    public void setFine(double fine);
}
