package practice_2;
/*
Класс Car
Создайте класс Car с полями brand (строка) и year (целое число).
Реализуйте конструктор с двумя параметрами, геттеры и сеттеры для обоих полей, метод print(), выводящий информацию о марке и годе выпуска.
В main создайте объект, установите значения через конструктор, измените год через сеттер, выведите информацию.
 */
public class Car {
    // поля
    String brand;
    int year;

    // конструктор
    Car(String someBrand, int someYear){
        this.brand = someBrand;
        this.year = someYear;
    }

    // геттер поля brand
    String getBrand(){
        return brand;
    }

    // геттер поля year
    int getYear(){
        return year;
    }

    // сеттер поля brand
    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    // сеттер поля year
    void setYear(int newYear){
        this.year = newYear;
    }

    // вывод информации о марке и годе выпуска авто
    void printCarInfo(){
        System.out.println("Марка авто: " + brand + ", год выпуска: " + year);
    }
}
