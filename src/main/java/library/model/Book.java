/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package library.model;

import java.util.Objects;

public class Book extends Publication {
    public static final String TYPE = "Książka";
    private String author;
    private int pages;
    private String isbnNumber;

    public Book(String title, String author, String publisher, int year, int pages, String isbnNumber) {
        super(title, publisher, year);
        this.author = author;
        this.isbnNumber = isbnNumber;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(author, book.author)
                && Objects.equals(isbnNumber, book.isbnNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author, pages, isbnNumber);
    }

    @Override
    public String toCsv() {
        return TYPE + ";" +
                getTitle() + ";" +
                author + ";" +
                getPublisher() + ";" +
                getYear() + ";" +
                pages + ";" +
                isbnNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", autor: " + author + ", ilość stron: "
                + pages + ", numer ISBN: " + isbnNumber;
    }
}