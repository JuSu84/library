/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package model;

public class Book {
    private String title;
    private String author;
    private String namePublishingHouse;
    private int releaseDate;
    private int pages;
    private String isbnNumber;

    public Book(String title, String author, String namePublishingHouse,
                int releaseDate, int pages) {
        this.title = title;
        this.author = author;
        this.namePublishingHouse = namePublishingHouse;
        this.releaseDate = releaseDate;
        this.pages = pages;
    }

    public Book(String title, String author, String namePublishingHouse,
                int releaseDate, int pages, String isbnNumber) {
        this(title, author, namePublishingHouse, releaseDate, pages);
        this.isbnNumber = isbnNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNamePublishingHouse() {
        return namePublishingHouse;
    }

    public void setNamePublishingHouse(String namePublishingHouse) {
        this.namePublishingHouse = namePublishingHouse;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
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
    public String toString() {
        return
                "title '" + title + '\'' +
                        ", author '" + author + '\'' +
                        ", \nPublishing House '" + namePublishingHouse + '\'' +
                        ", relase date: " + releaseDate +
                        ", pages: " + pages +
                        ", ISBN Number: '" + isbnNumber + '\'';
    }
}
