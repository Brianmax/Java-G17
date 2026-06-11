package ejercicio4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(
                "The Great Gatsby",
                "B-192",
                false,
                "George Maxi"
        );
        DVD dvd1 = new DVD(
                "Inception",
                "D-456",
                false,
                "Christopher Nolan",
                140
        );

        Book book2 = new Book(
                "To Kill a Mockingbird",
                "B-193",
                false,
                "Harper Lee"
        );

        LibraryUser libraryUser1 = new LibraryUser(
                "george",
                "U-001",
                new ArrayList<>()
        );

        LibraryUser libraryUser2 = new LibraryUser(
                "maria",
                "U-002",
                new ArrayList<>()
        );

        LibraryUser libraryUser = new LibraryUser(
                "juan",
                "U-003",
                new ArrayList<>()
        );

        // Agregar usuarios a la biblioteca

        library.addUser(libraryUser1);
        library.addUser(libraryUser2);

        library.addItem(book1);
        library.addItem(dvd1);
        library.addItem(book2);

        library.showInfo();


        // prestamo de B-193 a U-001
        library.loanItem("B-193", "U-001");
        System.out.println();
        System.out.println();
        library.showInfo();

        // prestamo de B-193 a U-002 (deberia mostrar que el item ya esta prestado)
        library.loanItem("B-193", "U-002");

    }
}
