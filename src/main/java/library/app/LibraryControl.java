/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package library.app;

import library.io.DataReader;
import library.model.Book;
import library.model.Library;
import library.model.Magazine;

public class LibraryControl {

    private static final int EXIT = 0;
    private static final int ADD_BOOKS = 1;
    private static final int ADD_MAGAZINES = 2;
    private static final int SHOW_BOOKS = 3;
    private static final int SHOW_MAGAZINES = 4;

    private Library library = new Library();
    private DataReader dataReader = new DataReader();

    public void controlLoop() {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case EXIT:
                    exit();
                    break;
                case ADD_BOOKS:
                    addBook();
                    break;
                case SHOW_BOOKS:
                    printBooks();
                    break;
                case ADD_MAGAZINES:
                    addMagazine();
                    break;
                case SHOW_MAGAZINES:
                    printMagazines();
                    break;
                default:
                    System.out.println("Wybrałeś nieprawidłową opcj");
            }
        }while (option != EXIT);
    }

    private void exit() {
        System.out.println("Zamykam Bibliotekę, do zobaczenia");
        dataReader.close();
    }

    private void addBook() {
        Book book = dataReader.createBook();
        library.addBook(book);
    }

    private void printBooks(){
        library.printBooks();
    }

    private void addMagazine() {
        Magazine magazine = dataReader.createMagazine();
        library.addMagazine(magazine);
    }

    private void printMagazines(){
        library.printMagazines();
    }

    private void printOptions() {
        System.out.println("Wybierz opcje");
        System.out.println(EXIT + " - wyjście z programu");
        System.out.println(ADD_BOOKS + " - dodanie nowej ksiażki");
        System.out.println(ADD_MAGAZINES + " - dodanie nowego magazynu");
        System.out.println(SHOW_BOOKS + " - wyświetl dostępne książki");
        System.out.println(SHOW_MAGAZINES + " - wyświetl dostępne magazyny");
    }
}
