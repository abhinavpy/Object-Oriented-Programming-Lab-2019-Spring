import java.util.Date;

public class Book {
    String Name;
    int Quantity;
    String Author;
    String Publication;
    Date addedDate;

    Date issueDate;
    Date dueDate;

    public Book(Book b) {
        this.Name = b.Name;
        this.Quantity = 1;
        this.Author = b.Author;
        this.Publication = b.Publication;
        this.addedDate = b.addedDate;
        this.issueDate = b.issueDate;
    }

    public double calculateFine(Date date){
        int days = (int) ((date.getTime() - issueDate.getTime())/(1000 * 60 * 60 * 24));
        double fine = 0;
        if(days > 7){
            fine = (days - 7) * 5 + 7 * 2.5;
        }
        else
            fine = days * 2.5;
        //this.fine = fine;
        return fine;
    }

    public Book(String name, int quantity, String author, String publication, Date addedDate) {
        Name = name;
        Quantity = quantity;
        Author = author;
        Publication = publication;
        this.addedDate = addedDate;
    }
    public void printBook(int i){
        Book book = this;
        System.out.println(i + "\t\t\t" + book.Name + "\t\t\t" + book.Quantity + "\t\t\t\t" + book.Author + "\t\t\t" + book.Publication + "\t\t\t\t" + book.addedDate);
    }
}
