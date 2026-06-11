package ejercicio4;

import java.util.ArrayList;

public class LibraryUser {
    private String username;
    private String userId;
    private ArrayList<LibraryItem> loanedItems;

    public LibraryUser(String username, String userId, ArrayList<LibraryItem> loanedItems) {
        this.username = username;
        this.userId = userId;
        this.loanedItems = loanedItems;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ArrayList<LibraryItem> getLoanedItems() {
        return loanedItems;
    }

    public void setLoanedItems(ArrayList<LibraryItem> loanedItems) {
        this.loanedItems = loanedItems;
    }

    public void showDetails() {
        System.out.println("Username: " + username);
        System.out.println("User ID: " + userId);
        System.out.println("Loaned Items: " + loanedItems.size());
    }
}
