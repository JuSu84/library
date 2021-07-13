/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package library.model;

import java.util.Objects;

public class Magazine extends Publication {
    public static final String TYPE = "Magazyn";
    private int month;
    private int day;
    private String language;

    public Magazine(String title, String publisher, int year, int month, int day, String language) {
        super(title, publisher, year);
        this.month = month;
        this.day = day;
        this.language = language;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return month == magazine.month && day == magazine.day
                && Objects.equals(language, magazine.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), month, day, language);
    }

    @Override
    public String toCsv() {
        return TYPE + ";" +
                getTitle() + ";" +
                getPublisher() + ";" +
                getYear() + ";" +
                month + ";" +
                day + ";" +
                language;
    }

    @Override
    public String toString() {
        return super.toString() + "-" + month + "-" + day + ", język: " + language;
    }
}
