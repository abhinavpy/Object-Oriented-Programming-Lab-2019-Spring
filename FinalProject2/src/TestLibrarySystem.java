import java.util.*;

public class TestLibrarySystem {
    public static void main(String args) {
        Scanner scan = new Scanner(System.in);
        LibraryRecords libr = new LibraryRecords();
        Student[] students;
        Teacher[] teachers;
        int noOfStudents = 0;
        int noOfTeachers = 0;

        System.out.println("Enter \n1. Add new book into the library.\n2. Delete Book from the library\n3. View Book " +
                "in the library\n4. Issue Book.\n5. Return Book\n");;

        while(true) {
            System.out.println("Enter the name of a book\n");
            int input;
            input = scan.nextInt();
            switch (input) {
                case 1: {
                    System.out.println("Enter the name, author, publisher of the new book to be added into the library.\n");
                    String nameOfNewBook, author, publisher;
                    nameOfNewBook = scan.nextLine();
                    author = scan.nextLine();
                    publisher = scan.nextLine();
                    Book newbook = new Book(nameOfNewBook, author, publisher);
                    Date date = new Date();
                    libr.booksList.put(newbook, date);
                    System.out.println("Added successfully.\n");
                    break;
                }

                case 2: {
                    System.out.println("Enter name of the book to be deleted\n");
                    String nameOfBook;
                    nameOfBook = scan.nextLine();
                    libr.booksList.remove(nameOfBook);
                    System.out.println("Deleted successfully\n");
                }

                case 3: {
                    System.out.println("Enter the name of the book to view.\n");
                    String nameOfBook;
                    nameOfBook = scan.nextLine();
                    Date date = libr.booksList.get(nameOfBook);
                    System.out.println("Book name: " + nameOfBook + " LastDate: " + date "\n");
                }

                case 4: {
                    System.out.println("Enter 1 to issue to a student, Enter 2 to issue to a teacher.\n");
                    int check;
                    check = scan.nextInt();
                    if(check == 1) {
                        System.out.println("Enter student name\n");
                        String name;
                        System.out.println("This is the list of books\n");
                        Set< Map.Entry< Book, Date> > st = libr.booksList.entrySet();

                        for (Map.Entry<Book,Date> me:st)
                        {
                            System.out.println(me.getKey().getName()+":" + me.getKey().getAuthor()+":"+me.getKey().getPublisher()+":");
                        }

                        Map<Book, Date> bookList = new HashMap<Book, Date>();

                        System.out.println("Enter 5 books to be issued:");
                        for(int i=0; i < 5; ++i) {
                            String bname;
                            bname = scan.nextLine();
                            libr.booksList.get(bname);
                            Date dueDate = new Date(1296000000);
                            bookList.put(bname, dueDate);
                        }
                        Student student = new Student();
                    }
                }
            }
        }
    }
}
