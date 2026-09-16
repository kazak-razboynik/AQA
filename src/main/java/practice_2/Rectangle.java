package practice_2;
/*
Класс Rectangle
Создайте класс Rectangle с полями width и height.
Реализуйте конструктор, геттеры для ширины и высоты, сеттер только для ширины и метод calculateArea() для расчёта площади.
В main создайте прямоугольник, измените ширину и выведите площадь.
 */
public class Rectangle {
    // поля
    int width;
    int height;

    // конструктор
    Rectangle(int someWidth, int someHeight){
        this.width = someWidth;
        this.height = someHeight;
    }

    //геттер width
    int getWidth(){
        return width;
    }

    //геттер height
    int getHeight(){
        return height;
    }

    //сеттер width
    void setWidth(int newWidth){
        this.width = newWidth;
    }

    // метод для расчета площади
    void calculateArea(){
        System.out.println("Площадь прямоугольника = " + width * height);
    }
}
