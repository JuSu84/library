/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package library.model;

public class Book extends Publication {
    private String author;
    private int pages;
    private String isbnNumber;

    public Book(String s, String title, String publisher, int year,
                String author, String isbnNumber, int pages) {
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


    public String printInfo() {
        String info = "title '" + getTitle() + '\'' +
                ", author '" + author + '\'' +
                ", \nPublishing House '" + getPublisher() + '\'' +
                ", relase date: " + getYear() +
                ", pages: " + pages;
        if (isbnNumber != null)
            info = info + ", ISBN Number: '" + isbnNumber + '\'';

        return info;

    }
}
