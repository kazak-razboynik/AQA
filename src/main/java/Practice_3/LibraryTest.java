package Practice_3;

public class LibraryTest {
    public static void printBookInfo() {
        Library book1 = new Library("Колобок", "Русские народные", 99, "Сказки");
        book1.setYear(199);
        System.out.println(book1.getYear());
    }
}
