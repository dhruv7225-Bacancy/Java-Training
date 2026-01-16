package Library;

public class Main {
    public static void main(String[] args) {
        Book b=new Book(1,"hello");
        b.getLoanPeriod();

        Magazine m=new Magazine(2,"world");
        m.getLoanPeriod();

        LibraryItem b2=new Book(3, "new book");
        b2.getLoanPeriod();

    }
}
