package practice_2;
/*
Класс Point
Создайте класс Point с координатами x и y.
Реализуйте конструктор, геттеры, сеттер только для x, и метод print(), выводящий координаты.
В main измените x, выведите новые координаты.
 */
public class Point {
    // поля
    int x;
    int y;

    // конструктор
    Point(int someX, int someY){
        this.x = someX;
        this.y = someY;
    }

    // геттеры полей x, y
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }

    // сеттер поля x
    void setX(int newX){
        this.x = newX;
    }

    // вывод координат
    void print(){
        System.out.println("Координаты " + x + ":" + y);
    }
}
