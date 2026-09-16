package practice_2;
/*
Класс Laptop
Создайте класс Laptop с полями brand и price.
Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о ноутбуке и его цене.
В main измените цену и выведите информацию.
 */
public class Laptop {
    // поля
    String brand;
    int price;

    // конструктор
    Laptop(String someBrand, int somePrice){
        this.brand = someBrand;
        this.price = somePrice;
    }

    // геттеры
    String getBrand() {
        return brand;
    }
    int getPrice(){
        return price;
    }

    // сеттеры
    void setBrand(String newBrand){
        this.brand = newBrand;
    }
    void setPrice(int newPrice){
        this.price = newPrice;
    }

    // метод вывода информации
    void printInfo(){
        System.out.println("Ноутбук "+ brand +  ", цена " + price + " руб.");
    }
}
