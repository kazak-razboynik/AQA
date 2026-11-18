package practice_3;
/**
 * Создайте класс Person с полями:
 * private String firstName
 * private String lastName
 * private final String ssn — номер социального страхования
 * Реализуйте конструктор для всех трёх полей,
 * геттеры для всех полей, сеттеры только для firstName и lastName,
 * метод printPersonInfo() — выводит: "Имя: Иван, Фамилия: Иванов, SSN: 123-45-6789".
 * В main: создайте несколько объектов, измените имя у одного и выведите информацию.
 */
public class Person {
    // поля
    private String firsName;
    private String lastName;
    private final String ssn;

    // конструтор
    Person(String newFirstName, String newLastName, String newSSN){
        this.firsName = newFirstName;
        this.lastName = newLastName;
        this.ssn = newSSN;
    }

    // геттеры
    public String getFirstName(){
        return this.firsName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSSN(){
        return this.ssn;
    }

    // сеттеры для ФИО
    public void setFirstName(String newFirstName){
        this.firsName = newFirstName;
    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    // метод выводящий общее инфо
    public void printPersonInfo() {
        System.out.println("Имя: " + firsName + ", Фамилия: " + lastName + ", SSN: " + ssn);
    }
}
