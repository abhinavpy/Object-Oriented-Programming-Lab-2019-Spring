import java.util.*;

public class TestLibrarySystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Book, Date> smap = new HashMap<>();
        LibraryRecords libr = new LibraryRecords(smap);
        Student[] students = new Student[100];
        Teacher[] teachers = new Teacher[100];
        int noOfStudents = 0;
        int noOfTeachers = 0;

        System.out.println("Enter \n1. Add new book into the library.\n2. Delete Book from the library\n3. View Book " +
                "in the library\n4. Issue Book.\n5. Return Book\n");;

        while(true) {
            System.out.println("Enter input as specified:\n");
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
                    break;
                }

                case 3: {
                    System.out.println("Enter the name of the book to view.\n");
                    String nameOfBook;
                    nameOfBook = scan.nextLine();
                    Date date = libr.booksList.get(nameOfBook);
                    System.out.println("Book name: " + nameOfBook + " LastDate: " + date + "\n");
                    break;
                }

                case 4: {
                    System.out.println("Enter 1 to issue to a student, Enter 2 to issue to a teacher.\n");
                    int check;
                    check = scan.nextInt();
                    if(check == 1) {
                        System.out.println("Enter student name\n");
                        String name;
                        name = scan.nextLine();
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
                            Book book = new Book(bname, "author1", "publisher1");
                            Date dueDate = new Date(1296000000);
                            bookList.put(book, dueDate);
                        }
                        Student student = new Student(name, bookList, 0.0);
                        students[noOfStudents] = student;
                        noOfStudents++;
                    }

                    if(check == 2) {
                        System.out.println("Enter teacher name\n");
                        String name;
                        name = scan.nextLine();
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
                            Book book = new Book(bname, "author1", "publisher1");
                            Date dueDate = new Date(1296000000 * 2);
                            bookList.put(book, dueDate);
                        }
                        Teacher teacher = new Teacher(name, bookList, 0.0);
                        teachers[noOfTeachers] = teacher;
                        noOfTeachers++;
                    }
                    break;
                }
                case 5: {
                    System.out.println("enter if a student or a teacher is returning a book.\n");
                    int check;
                    check = scan.nextInt();
                    if(check == 1) {
                        System.out.println("Enter name of student that is returning the book:");
                        String sname;

                        sname = scan.nextLine();

                        for(int i=0; i <= noOfStudents; ++i) {
                            Student student = students[i];
                            if(student.name == sname) {
                                Map<Book, Date> bookDateMap = student.books;
                                Set< Map.Entry< Book,Date> > st = student.books.entrySet();

                                for (Map.Entry<Book,Date> me:st)
                                {
                                    System.out.print(me.getKey().getName()+":");
                                    System.out.println(me.getValue());
                                }
                                System.out.println("Fine: " + student.getFine());
                            }
                        }

                        break;
                    }

                    if(check == 2) {
                        System.out.println("Enter name of teacher that is returning the book:");
                        String sname;

                        sname = scan.nextLine();

                        for(int i=0; i <= noOfTeachers; ++i) {
                            Teacher teacher = teachers[i];
                            if(teacher.name == sname) {
                                Map<Book, Date> bookDateMap = teacher.books;
                                Set< Map.Entry< Book,Date> > st = teacher.books.entrySet();

                                for (Map.Entry<Book,Date> me:st)
                                {
                                    System.out.print(me.getKey().getName()+":");
                                    System.out.println(me.getValue());
                                }
                                System.out.println("Fine: " + teacher.getFine());
                            }
                        }
                        break;
                    }

                    else {
                        System.out.println("Invalid.");
                        break;
                    }
                }
            }
        }
    }
}
