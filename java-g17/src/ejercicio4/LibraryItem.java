package ejercicio4;

public abstract class LibraryItem {
    protected String title;
    protected String itemId;
    protected boolean isLoaned;

    public LibraryItem(String title, String itemId, boolean isLoaned) {
        this.title = title;
        this.itemId = itemId;
        this.isLoaned = isLoaned;
    }

    public LibraryItem() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    public void setLoaned(boolean loaned) {
        isLoaned = loaned;
    }

    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + itemId);
        System.out.println("Loaned: " + (isLoaned ? "Yes" : "No"));
    }
    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", itemId='" + itemId + '\'' +
                ", isLoaned=" + isLoaned;
    }
}
