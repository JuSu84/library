public class Library {
    public static void main(String[] args) {
        final String appName = "Bliblioteka v0.1";

        Book book1 = new Book("Wiedźmin. Ostatnie życzenie", "Wiedźmin. Ostatnie życzenie",
                "NOWA sp. z p.o.", 2011, 286, "978-83-7578-028-4" );


        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece: ");
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.namePublishingHouse);
        System.out.println(book1.relaseDate);
        System.out.println(book1.pages);
        System.out.println(book1.isbnNumber);


    }
}
