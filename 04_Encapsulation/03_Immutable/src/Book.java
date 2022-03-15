public class Book {
    private final String title;
    private final String author;
    private final int numberPages;
    private final int InternationalStandardBookNumber;

    public Book(String title, String author, int numberPages, int InternationalStandardBookNumber) {
        this.title = title;
        this.author = author;
        this.numberPages = numberPages;
        this.InternationalStandardBookNumber = InternationalStandardBookNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public int getInternationalStandardBookNumber() {
        return InternationalStandardBookNumber;
    }
}
