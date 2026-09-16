package practice_2;
/*
Класс Product
Создайте класс Product с полями name и price.
Реализуйте конструктор, геттеры, сеттер для цены, метод applyDiscount(discount) для применения скидки,
и метод printInfo(), выводящий информацию о товаре и цене.
В main измените цену, примените скидку и выведите цену.
 */
public class Product {
    // поля
    String name;
    double price;

    // конструктор
    Product(String someName, double somePrice){
        this.name = someName;
        this.price = somePrice;
    }

    // геттеры
    String getName(){
        return this.name;
    }
    double getPrice(){
        return this.price;
    }

    // сеттер поля цена
    void setPrice(double newPrice){
        this.price = newPrice;
    }

    // метод расчета применения скидки
    void applyDiscount(double discount){
        this.price = this.price * (1 - discount / 100);
    }

    // метод вывода информации о товаре и его цене
    void printInfo(){
        System.out.println("Товар " + name + ", цена " + price);
    }
}
