package Library;

public class Book extends LibraryItem{
    Book(int id,String title){
        setId(id);
        setTitle(title);
        System.out.println(getId());
        System.out.println(getTitle());
    }
    @Override
    void getLoanPeriod() {
        System.out.println("loan period of 30 days");
    }
}
