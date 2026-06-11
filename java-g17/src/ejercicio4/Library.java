package ejercicio4;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Optional;

public class Library {
    private ArrayList<LibraryItem> items;
    private ArrayList<LibraryUser> users;

    public Library(ArrayList<LibraryItem> items, ArrayList<LibraryUser> users) {
        this.items = items;
        this.users = users;
    }

    public Library() {
        items = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addItem(LibraryItem libraryItem) {
        String itemId = libraryItem.getItemId(); // 72

        for(LibraryItem item: items) {
            if(itemId.equals(item.getItemId())) {
                System.out.println("Item with ID " + itemId + " already exists.");
                return;
            }
        }
        items.add(libraryItem);
    }

    public void showAllItems() {

    }

    public void loanItem(String itemId, String userId) {
        Optional<LibraryItem> itemOpt = findItem(itemId);
        Optional<LibraryUser> userOpt = findUser(userId);

        if( itemOpt.isEmpty() || userOpt.isEmpty()) {
            System.out.println("Item or user not found.");
            return;
        }

        LibraryUser user = userOpt.get();
        LibraryItem item = itemOpt.get();

        if(item.isLoaned()) {
            System.out.println("Item " + item.title + "is already loaned.");
            return;
        }
        user.addLoanedItem(item); // agrega el item a la lista de items prestados del usuario
        item.setLoaned(true); // marcamos el item como prestado
    }
    // implementar el metodo para poder retornar un item

    // metodo para agregar un usuario

    public void addUser(LibraryUser user) {
        Optional<LibraryUser> userOpt = findUser(user.getUserId());

        if (userOpt.isPresent()) {
            System.out.println("User with ID " + user.getUserId() + " already exists.");
            return;
        }
        users.add(user);
    }

    public void showInfo() {
        System.out.println("================== USUARIOS ==================");
        for(LibraryUser libraryUser: users) {
            System.out.println(libraryUser);
        }

        System.out.println("================== ITEMS ==================");
        for(LibraryItem item: items) {
            System.out.println(item);
        }
    }

    private Optional<LibraryItem> findItem(String itemId) {
        for(LibraryItem item: items) {
            if ( itemId.equals(item.getItemId()) ) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    private Optional<LibraryUser> findUser(String userId) {
        for(LibraryUser user: users) {
            if ( userId.equals(user.getUserId()) ) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
