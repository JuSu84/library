/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package library.app;

import library.exeption.DataExportException;
import library.exeption.DataImportException;
import library.exeption.InvalidDataException;
import library.exeption.NoSuchOptionException;
import library.io.ConsolePrinter;
import library.io.DataReader;
import library.io.file.FileManager;
import library.io.file.FileManagerBuilder;
import library.model.Book;
import library.model.Library;
import library.model.Magazine;
import library.model.Publication;

import java.util.InputMismatchException;

class LibraryControl {

    private ConsolePrinter printer = new ConsolePrinter();
    private Library library;
    private DataReader dataReader = new DataReader(printer);
    private FileManager fileManager;

    LibraryControl() {
        fileManager = new FileManagerBuilder(printer, dataReader).build();
        try {
            library = fileManager.importData();
            printer.printLine("Zaimportowano dane z pliku");
        } catch (DataImportException | InvalidDataException e) {
            printer.printLine(e.getMessage());
            printer.printLine("Stworzono nową bazę.");
            library = new Library();
        }
    }

    void controlLoop() {
        Option option;

        do {
            printOptions();
            option = getOption();
            switch (option) {
                case EXIT:
                    exit();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                default:
                    printer.printLine("Wybrałeś nieprawidłową opcj");
            }
        } while (option != Option.EXIT);
    }

    private Option getOption() {
        boolean optionOk = false;
        Option option = null;
        while (!optionOk) {
            try {
                option = Option.createFromInt(dataReader.getInt());
                optionOk = true;
            } catch (NoSuchOptionException e) {
                printer.printLine(e.getMessage() + ", podaj ponownie");
            } catch (InputMismatchException ignored) {
                printer.printLine("Wprowadzono wartość, która nie jest liczbą, podaj ponownie:");
            }
        }
        return option;
    }

    private void exit() {
        try {
            fileManager.exportData(library);
            printer.printLine("Eksport danych do pliku zakończony powodzeniem");
        } catch (DataExportException e) {
            printer.printLine(e.getMessage());
        }
        printer.printLine("Zamykam Bibliotekę, do zobaczenia");
        //zamykam strumień wejścia
        dataReader.close();
    }

    private void addBook() {
        try {
            Book book = dataReader.createBook();
            library.addPublication(book);
        } catch (InputMismatchException e) {
            printer.printLine("Nie udało się utworzyć magazynu, błędnie wprowadzone dane");
        } catch (ArrayIndexOutOfBoundsException e) {
            printer.printLine("Osiągnięto limit pojemnośći, nie można dodać kolejnej książki");
        }
    }

    private void printBooks() {
        Publication[] publications = library.getPublications();
        printer.printBooks(publications);
    }

    private void addMagazine() {
        try {
            Magazine magazine = dataReader.createMagazine();
            library.addPublication(magazine);
        } catch (InputMismatchException e) {
            printer.printLine("Nie udało się utworzyć książki, błędnie wprowadzone dane");
        } catch (ArrayIndexOutOfBoundsException e) {
            printer.printLine("Osiągnięto limit pojemnośći, nie można dodać kolejnego magazynu");
        }
    }

    private void printMagazines() {
        Publication[] publications = library.getPublications();
        printer.printMagazines(publications);
    }

    private void printOptions() {
        printer.printLine("Wybierz opcje");
        for (Option option : Option.values()) {
            printer.printLine(option.toString());
        }
    }

    private enum Option {
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

        @Override
        public String toString() {
            return values + " - " + description;
        }

        static Option createFromInt(int option) throws NoSuchOptionException {
            try {
                return Option.values()[option];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchOptionException("Brak opcji wyboru o id: " + option);
            }
        }
    }
}
