package Library;

abstract class LibraryItem {
    private int itemId;
    private String title;

    public int getId(){
        return itemId;
    }
    public void setId(int id){
        this.itemId=id;
    }
    
    public String getTitle(){
        return title;
    }
    public void setTitle(String t){
        this.title=t;
    }
    void displayDetails(){
        System.out.println("Book id : "+itemId + "\n" + "Book Title : "+title);
    }
    abstract void getLoanPeriod();
}
