/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package library.io;

import library.model.Book;
import library.model.Magazine;

import java.util.Scanner;

public class DataReader {

    private Scanner scanner = new Scanner(System.in);
    private ConsolePrinter printer;

    public DataReader(ConsolePrinter printer) {
        this.printer = printer;
    }

    public Book createBook() {
        printer.printLine("Tytuł: ");
        String title = scanner.nextLine();
        printer.printLine("Autor: ");
        String author = scanner.nextLine();
        printer.printLine("Wydawnictwo: ");
        String publisher = scanner.nextLine();
        printer.printLine("Rok wydania: ");
        int year = getInt();
        printer.printLine("Ilość stron: ");
        int pages = getInt();
        printer.printLine("ISBN: ");
        String isbn = scanner.nextLine();

        return new Book(title, author, publisher, year, pages, isbn);
    }

    public Magazine createMagazine() {
        printer.printLine("Tytuł: ");
        String title = scanner.nextLine();
        printer.printLine("Wydawnictwo: ");
        String publisher = scanner.nextLine();
        printer.printLine("Język: ");
        String language = scanner.nextLine();
        printer.printLine("Rok wydania: ");
        int year = getInt();
        printer.printLine("Miesiąc: ");
        int month = getInt();
        printer.printLine("Dzień: ");
        int day = getInt();

        return new Magazine(title, publisher, year, month, day, language);
    }

    public int getInt() {
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }
    }

    public String getString() {
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
}
