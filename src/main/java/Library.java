
/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

// author Paweł Bajda

import model.Book;

class Library {
    public static void main(String[] args) {
        final String appName = "Bliblioteka v0.3";

//        Add new book to Library
        Book book1 = new Book("Wiedźmin. Ostatnie życzenie", "Andrzej Sapkowski",
                "NOWA sp. z p.o.", 2011, 286, "978-83-7578-028-4");
        Book book2 = new Book("Finansowy Ninja", "Michał Szafrański",
                "Kaveo Publishing", 2019, 539, "978-83-65308-05-4");
        Book book3 = new Book("Narrenturm", "Andrzej Sapkowski",
                "NOWA sp. z p.o.", 2002, 592);

        System.out.println(appName);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);


    }
}
