public class Menu {

    private final Bibliothek bibliothek;

    public Menu() {
        this.bibliothek = new Bibliothek(new Author[]{
                new Author("Leon", 17),
                new Author("Bianka", 16),
                new Author("Sky", 17),
                new Author("Kian", 17),
                new Author("Mischa", 17),
        });
    }

    public void printAllAuthorAttributes() {
        PrinterUtil.printAllAuthors(bibliothek.getAllAuthors());
        int scannedInt = ScannerUtil.scanInt();
        printCloserInformation(scannedInt);
    }

    private void printCloserInformation(int authorAtIndex) {
        Author author = bibliothek.getAllAuthors()[authorAtIndex];
        System.out.println("Information about this author:");
        System.out.println("Name: " + author.getName());
        System.out.println("Age: " + author.getAge());
    }
}
