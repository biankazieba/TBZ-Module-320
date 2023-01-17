public class Film {

    private final String name;
    private final int price;
    private final int lengthInMinutes;

    private final Requisite requisite;

    private Genre genre;

    public Film(String name, int price, int lengthInMinutes) {
        this.name = name;
        this.price = price;
        this.lengthInMinutes = lengthInMinutes;
        this.requisite = new Requisite("beispiel requisite");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public Requisite getRequisite() {
        return requisite;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
