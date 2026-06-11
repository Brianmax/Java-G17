package ejercicio4;

public class Book extends LibraryItem{
    private String author;

    public Book(String title, String itemId, boolean isLoaned, String author) {
        super(title, itemId, isLoaned);
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
