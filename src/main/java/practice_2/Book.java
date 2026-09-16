package practice_2;
/*

Класс Book
Создайте класс Book с полями title и author.
Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий название и автора книги.
В main создайте книгу, измените автора и выведите информацию.
 */
public class Book {
    // поля
    String title;
    String author;

    // конструктор
    Book(String someTitle, String someAuthor){
        this.title = someTitle;
        this.author = someAuthor;
    }

    // геттер поля title
    String getTitle(){
        return this.title;
    }

    // геттер поля author
    String getAuthor(){
        return this.author;
    }

    // сеттер поля title
    void setTitle(String newTitle){
        this.title = newTitle;
    }

    // сеттер поля author
    void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    // метод выводящий информацию о книге
    void printInfo(){
        System.out.println("Книга " + title + ", автор " + author);
    }
}
