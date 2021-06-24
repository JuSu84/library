/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package library.model;

public class Library {

    private static final int MAX_BOOKS = 1000;
    private static final int MAX_MAGAZINES = 1000;

    private Book[] books = new Book[MAX_BOOKS];
    private Magazine[] magazines = new Magazine[MAX_MAGAZINES];
    private int booksNumber;
    private int magazinesNumber;

    public void addBook(Book book) {
        if (booksNumber < MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Osiągnięto maksymalną liczbę książek");
        }
    }

    public void printBooks() {
        if (booksNumber == 0) {
            System.out.println("Brak zapisanych książek");
        }
        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }
    }

        public void addMagazine(Magazine magazine){
            if (magazinesNumber < MAX_MAGAZINES) {
                magazines[magazinesNumber] = magazine;
                magazinesNumber++;
            } else
                System.out.println("Osiągnięto maksymalną liczbę magazynów");
        }

        public void printMagazines() {
            if (magazinesNumber == 0) {
                System.out.println("Brak zapisanych magazynów");
            }
            for (int i = 0; i < magazinesNumber; i++) {
                magazines[i].printInfo();
            }
        }
}
