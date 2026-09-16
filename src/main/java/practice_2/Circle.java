package practice_2;
/*
Класс Circle
Создайте класс Circle с полем radius.
Реализуйте конструктор, геттер и сеттер, методы calculateArea() и calculateCircumference().
В main измените радиус, выведите площадь и длину окружности.

 */

public class Circle {
    // поле
    double radius;

    // конструктор
    Circle(double someRadius){
        this.radius = someRadius;
    }

    // геттер
    double getRadius(){
        return radius;
    }

    // сеттер
    void setRadius(double newRadius){
        this.radius = newRadius;
    }

    // метод расчета площади
    void calculateArea(){
        System.out.println("Площадь равна " + (Math.PI * Math.pow(radius, 2)));
    }

    // метод длины окружности
    void calculateCircumference(){
        System.out.println("Длина окружности равна " + (2 *  Math.PI * radius));
    }
}
