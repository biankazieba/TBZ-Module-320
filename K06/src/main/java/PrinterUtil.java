public class PrinterUtil {

    public static void printAllAuthors(Author[] authors) {
        int index = 0;
        for (Author author : authors) {
            System.out.println(index + ": " + author.getName());
            index++;
        }
    }
}
