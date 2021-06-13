public class Book {
    String title;
    String author;
    String namePublishingHouse;
    int relaseDate;
    int pages;
    String isbnNumber;

    public Book(String title, String author, String namePublishingHouse,
                int relaseDate, int pages, String isbnNumber) {
        this.title = title;
        this.author = author;
        this.namePublishingHouse = namePublishingHouse;
        this.relaseDate = relaseDate;
        this.pages = pages;
        this.isbnNumber = isbnNumber;
    }
}
