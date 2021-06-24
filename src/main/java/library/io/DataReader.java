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


    public Book createBook(){
        System.out.println("Tytuł: ");
        String title = scanner.nextLine();
        System.out.println("Autor: ");
        String author = scanner.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = scanner.nextLine();
        System.out.println("Rok wydania: ");
        int releaseDate = scanner.nextInt();
        System.out.println("Ilość stron: ");
        int pages = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();

        return new Book(title, author, publisher, releaseDate, pages, isbn);
    }

    public Magazine createMagazine(){
        System.out.println("Tytuł: ");
        String title = scanner.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = scanner.nextLine();
        System.out.println("Język: ");
        String language = scanner.nextLine();
        System.out.println("Rok wydania: ");
        int year = getInt();
        System.out.println("Miesiąc: ");
        int month = getInt();
        System.out.println("Dzień: ");
        int day = getInt();

        return new Magazine(title, publisher, language, year, month, day);
    }

    public int getInt(){
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public void close(){
        scanner.close();
    }
}
