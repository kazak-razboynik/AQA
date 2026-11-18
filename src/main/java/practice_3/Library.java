package practice_3;
/**
 * Создайте класс Library с полями:
 * private String bookTitle
 * protected String author
 * int year (default-доступ)
 * public String category
 * Реализуйте геттеры и сеттеры для всех полей.
 * В другом классе (например, LibraryTest) создайте объект Library и проверьте доступ к полям.
 */
public class Library {
    // поля
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    // конструктор
    Library(String newBookTitle, String newAuthor, int newYear, String newCategory){
        this.bookTitle = newBookTitle;
        this.author = newAuthor;
        this.year = newYear;
        this.category = newCategory;
    }

    // геттеры
    public String getBookTitle() {
        return bookTitle;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public String getCategory() {
        return category;
    }

    // сеттеры
    public void setBookTitle(String newBookTitle) {
        this.bookTitle = newBookTitle;
    }
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    public void setYear(int newYear) {
        this.year = newYear;
    }
    public void setCategory(String newCategory) {
        this.category = newCategory;
    }
}
