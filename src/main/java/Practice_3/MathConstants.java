package Practice_3;
/**
 * Создайте класс MathConstants с полями:
 * final double PI = 3.14159
 * final double E = 2.71828
 * Реализуйте статические методы calculateCircleArea(double r) — площадь круга
 * и calculateCircumference(double r) — длина окружности.
 * В main: вызовите методы с разными значениями радиуса.
 * calculateExponentialGrowth(double initialValue, double rate, double time) — расчет по формуле экспоненциального роста:
 */
public class MathConstants {
    // поля
    static final double PI = 3.14;
    static final double E = 2.71828;

    // метод расчета площади круга
    static double calculateCircleArea(double r){
        return PI * Math.pow(r, 2);
    }

    // метод расчета длины окружности
    static double calculateCircumference(double r){
        return 2 * PI * r;
    }

    // метод расчета по формуле экспоненциального роста
    static double calculateExponentialGrowth(double initialValue, double rate, double time){
        return initialValue * (E * (rate * time));
    }
}
