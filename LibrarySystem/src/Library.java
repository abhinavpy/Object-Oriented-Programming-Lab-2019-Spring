import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Library {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n, id = 0;
        Date pi = new Date(1,2,4);
        Date po = new Date(1, 2, 1);
        System.out.println((pi.getTime() - po.getTime()) / (1000 * 60 * 60 * 24));
        ArrayList<Book> books = new ArrayList<>();

        ArrayList<Person> people = new ArrayList<>();
        do{
            System.out.println("1. Add Book \n2. Delete Book\n3. View Books\n4. View Issued books\n5. Add Student\n6. Add Faculty\n7. Issue and Return Portal\n8. Send Due notice");
            n = in.nextInt();
            switch (n){
                case 1: System.out.println("Enter Book Name, quantity, Author, Publication and Date of addition( yyyy mm dd)  : ");
                    String Name = in.next();
                    int Quantity = in.nextInt();
                    String Author = in.next();
                    String Publication = in.next();
                    int y = in.nextInt();
                    int m = in.nextInt();
                    int d = in.nextInt();
                    Date addedDate = new Date(y, m, d);
                    Book b = new Book(Name, Quantity, Author, Publication, addedDate);
                    books.add(b);
                    break;
                case 2:
                    System.out.println("Enter Book Name and quantity");
                    Name = in.next();
                    Quantity = in.nextInt();
                    int qty = 0;
                    for(int i = 0; i < books.size(); i++) {
                        Book book = books.get(i);
                        if (book.Name.equals(Name))
                            qty += book.Quantity;
                    }
                    if(qty < Quantity){
                        System.out.println("We do not have enough books");
                        break;
                    }
                    for(int i = 0; i < books.size() || Quantity > 0; i++){
                        if(i == books.size())
                            i = 0;
                        Book book = books.get(i);
                        if(book.Name.equals(Name)) {
                            if(book.Quantity <= Quantity){
                                Quantity -= book.Quantity;
                                System.out.println(" Removing " + book.Quantity + " Books");
                                books.remove(book);
                            }
                            else{
                                System.out.println(" Removing " + Quantity + " Books.");
                                books.get(i).Quantity -= Quantity;
                                Quantity = 0;
                            }
                            if(Quantity == 0)
                                break;
                            System.out.println(Quantity);
                        }
                    }
                    System.out.println(Quantity);
                    break;
                case 3:
                    viewBooks(books);
                    break;
                case 4:
                    System.out.println("Sl.no." + "\t\t" + "Name" + "\t\t" + "Quantity" + "\t\t" + "Author" + "\t\t" + "Publication" + "\t\t" + "addedDate");
                    int j = 0;
                    for(int i = 0; i < people.size(); i++){
                        Person person = people.get(i);
                        for(int q = 0; q < person.books.size(); q++) {
                            Book book = person.books.get(q);
                                book.printBook(j++);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Enter Student Name");
                    String name = in.next();
                    System.out.println("Your id is " + id + "\nRemember for future transactions");
                    Student student = new Student(name, id++);
                    people.add(student);

                    break;
                case 6:
                    System.out.println("Enter Faculty Name");
                    name = in.next();
                    System.out.println("Your id is " + id + "\nRemember for future transactions");
                    Faculty faculty = new Faculty(name, id++);
                    people.add(faculty);
                    break;
                case 7:
                    int k;
                    String t;
                    System.out.println("Enter id :");
                    int iden = in.nextInt();
                    if(iden < 0 || iden >= people.size()){
                        System.out.println("Wrong ID!!");
                        break;
                    }
                    Person p = people.get(iden);
                    do{
                        System.out.println("Welcome" + p.Name + "\n1. Search by author\n2. Search by publisher\n3. Search by name\n4. View recently added books\n5. Issue book\n6. Return book\n7. Exit");
                        k = in.nextInt();
                        switch (k){
                            case 1:
                                System.out.println("Enter Author :");
                                t = in.next();
                                for(int i = 0; i < books.size(); i++){
                                    Book book = books.get(i);
                                    if(book.Author.equals(t))
                                        book.printBook(i);
                                }
                                break;
                            case 2:
                                System.out.println("Enter Publisher :");
                                t = in.next();
                                for(int i = 0; i < books.size(); i++){
                                    Book book = books.get(i);
                                    if(book.Publication.equals(t))
                                        book.printBook(i);
                                }
                                break;
                            case 3:
                                System.out.println("Enter Name:");
                                t = in.next();
                                for(int i = 0; i < books.size(); i++){
                                    Book book = books.get(i);
                                    if(book.Name.equals(t))
                                        book.printBook(i);
                                }
                                break;
                            case 4:
                                System.out.println("Enter current Date (yyyy mm dd) to get books added in the last 30 days: ");
                                y = in.nextInt();
                                m = in.nextInt();
                                d = in.nextInt();
                                Date date = new Date(y, m, d);
                                for(int i = 0; i < books.size(); i++){
                                    Book book = books.get(i);
                                    if((book.addedDate.getTime() - date.getTime()) / (1000 * 60 * 60 * 24) < 30)
                                        book.printBook(i);
                                }
                                break;
                            case 5:
                                System.out.println("Enter current Date (yyyy mm dd)");
                                y = in.nextInt();
                                m = in.nextInt();
                                d = in.nextInt();
                                date = new Date(y, m, d);
                                if(p.issueLimit <= p.books.size()){
                                    System.out.println("You can not issue any more books. Please return your books to issue more!");
                                    break;
                                }
                                viewBooks(books);
                                System.out.println("Enter Sl.no. of book to issue.");
                                int sl = in.nextInt();
                                if(sl < 0 || sl >= books.size()){
                                    System.out.println("Invalid number!!");
                                    break;
                                }

                                Book book = new Book(books.get(sl));
                                book.issueDate = date;
                                p.books.add(book);


                                Calendar c = Calendar.getInstance();
                                c.setTime(date);
                                c.add(Calendar.DATE, p.issueLimit);
                                book.dueDate = c.getTime();

                                //people.get(iden).books.add(book);
                                if(books.get(sl).Quantity == 1){
                                    books.remove(sl);
                                }
                                else
                                    books.get(sl).Quantity--;
                                break;
                            case 6:
                                System.out.println("Enter current Date (yyyy mm dd)");
                                y = in.nextInt();
                                m = in.nextInt();
                                d = in.nextInt();
                                date = new Date(y, m, d);
                                if(p.books.size() == 0){
                                    System.out.println("You did not issue any Books. Issue book and try again");
                                    break;
                                }
                                viewBooks(p.books);
                                System.out.println("Enter Sl.no. of book to return.");
                                sl = in.nextInt();
                                if(sl < 0 || sl >= books.size()){
                                    System.out.println("Invalid number!!");
                                    break;
                                }
                                b = p.books.get(sl);
                                int f = 0;
                                for(int i = 0; i < books.size(); i++){
                                    book = books.get(i);
                                    if(book.addedDate.compareTo(b.addedDate) == 0 &&  book.Name.equals(b.Name) && book.Publication.equals(b.Publication) && book.Author.equals(b.Author)){
                                        books.get(i).Quantity++;
                                        double fine = b.calculateFine(date);
                                        System.out.println("You have a fine of Rs" + fine + " on this book.");
                                        people.get(iden).fine += fine;
                                        people.get(iden).books.remove(sl);
                                        f = 1;
                                        break;
                                    }
                                }
                                if (f == 0) {
                                    b.issueDate = null;
                                    b.dueDate = null;
                                    books.add(b);
                                }
                                break;
                        }
                    }while(k != 7);
                    break;
                case 8:
                    System.out.println("Enter current Date (yyyy mm dd)");
                    y = in.nextInt();
                    m = in.nextInt();
                    d = in.nextInt();
                    Date date = new Date(y, m, d);
                    System.out.println("Due Date Has Passed For\nDue " + "\t\t" + "Name" + "\t\t" + "Quantity" + "\t\t" + "Author" + "\t\t" + "Publication" + "\t\t" + "addedDate");
                    j = 0;
                    for(int i = 0; i < people.size(); i++){
                        Person person = people.get(i);
                        for(int q = 0; q < person.books.size(); q++) {
                            Book book = person.books.get(q);
                            if(book.dueDate.before(date))
                                book.printBook((int)(book.dueDate.getTime() - date.getTime()) / (1000 * 60 * 60 * 24));
                        }
                    }

            }
        }while(n != 9);
    }
    public static void viewBooks(ArrayList<Book> books){
        System.out.println("Sl.no." + "\t\t" + "Name" + "\t\t" + "Quantity" + "\t\t" + "Author" + "\t\t" + "Publication" + "\t\t" + "addedDate");
        for(int i = 0; i < books.size(); i++){
            Book book = books.get(i);
            book.printBook(i);
        }
    }
}
