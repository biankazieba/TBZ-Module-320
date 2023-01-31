public class Bibliothek {

    private final Author[] authors;

    public Bibliothek(Author[] authors) {
        this.authors = authors;
    }

    public Author[] getAllAuthors() {
        return authors;
    }
}
