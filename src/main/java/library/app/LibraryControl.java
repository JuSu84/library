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

    private Library library = new Library();
    private DataReader dataReader = new DataReader();

    public void controlLoop() {
        Option option;

        do {
            printOptions();
            option = Option.createFromInt(dataReader.getInt());
            switch (option) {
                case EXIT:
                    exit();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                default:
                    System.out.println("Wybrałeś nieprawidłową opcj");
            }
        }while (option != Option.EXIT);
    }

    private void exit() {
        System.out.println("Zamykam Bibliotekę, do zobaczenia");
        //zamykam strumień wejścia
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
        for (Option option : Option.values()) {
            System.out.println(option);
        }
    }
}
