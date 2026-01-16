package Library;

public class Magazine extends LibraryItem{
    Magazine(int id,String title){
        setId(id);
        setTitle(title);
        System.out.println(getId());
        System.out.println(getTitle());
    }
    @Override
    void getLoanPeriod() {
        System.out.println("loan period of 50 days");
    }
}
