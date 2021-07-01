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
import library.model.Publication;

public class ConsolePrinter {

    public void printMagazines(Publication[] publications ) {
        int countMagazines = 0;
        for (Publication publication : publications) {
            if (publication instanceof Magazine) {
                printLine(publication.toString());
                countMagazines++;
            }
        }
        if (countMagazines == 0) {
            printLine("Brak zapisanych magazynów");
        }
    }

    public void printBooks(Publication[] publications) {
        int countBooks = 0;
        for (Publication publication : publications) {
            if (publication instanceof Book) {
                printLine(publication.toString());
                countBooks++;
            }
        }
        if (countBooks == 0) {
            printLine("Brak zapisanych książek");
        }
    }

    public void printLine(String text){
        System.out.println(text);
    }
}
