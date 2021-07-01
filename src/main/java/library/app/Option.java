/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package library.app;

import library.exeption.NoSuchOptionException;

public enum Option {
    EXIT(0, "Wyjście z programu"),
    ADD_BOOK(1, "Dodanie książki"),
    ADD_MAGAZINE(2, "Dodanie magazynu/gazety"),
    PRINT_BOOKS(3, "Wyświetlenie dostępnych książęk"),
    PRINT_MAGAZINES(4, "Wyświetlenie dostępnych magazynów/gazet");

    private int values;
    private String description;

    Option(int values, String description) {
        this.values = values;
        this.description = description;
    }

    public int getValues() {
        return values;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return values + " - " + description;
    }

    static Option createFromInt(int option) throws NoSuchOptionException {
        try {
            return Option.values()[option];
        }catch (ArrayIndexOutOfBoundsException e){
            throw new NoSuchOptionException("Brak opcji wyboru o id: " + option);
        }
    }
}
