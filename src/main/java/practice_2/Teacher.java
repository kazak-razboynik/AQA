package practice_2;
/*
Класс Teacher
Создайте класс Teacher с полями name и subject.
Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о учителе и предмете.
В main измените предмет и выведите обновлённую информацию.
 */
public class Teacher {
    // поля
    String name;
    String subject;

    // конструктор
    Teacher(String someName, String someSubject){
        this.name = someName;
        this.subject = someSubject;
    }

    // геттеры
    String getName(){
        return this.name;
    }
    String getSubject(){
        return this.subject;
    }

    // сеттеры
    void setName(String newName){
        this.name = newName;
    }
    void setSubject(String newSubject){
        this.subject = newSubject;
    }

    // метод выводящий информацию об учителе и его предмете
    void printInfo(){
        System.out.println("Учитель " + name + ", его/ее предмет " + subject);
    }
}
