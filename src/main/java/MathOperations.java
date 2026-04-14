public class MathOperations {
    public static void main(String[] args) { // точка входа для JVM

        int sum = MathOperations.add(10, 5);
        int difference = MathOperations.subtract(10, 5);
        int produce = MathOperations.multiply(2, 5);
        double division = MathOperations.divide(8, 4);
        int max = MathOperations.findMax(3, 7);
        int dif = MathOperations.difference(9, 12);
        int sqm = MathOperations.squareArea(15);
        int perimeter = MathOperations.squarePerimeter(12);
        int minutes = MathOperations.convertSecondsToMinutes(784);
        double speed = MathOperations.averageSpeed(25.0, 6.0);
        double hypotenuse1 = MathOperations.findHypotenuse(7, 12);
        double hypotenuse2 = MathOperations.findHypotenuse(3, 18);
        double hypotenuse3 = MathOperations.findHypotenuse(27, 5);
        double circleRadius = MathOperations.circleCircumference(19);
        double percent = MathOperations.calculatePercentage(10.0, 1.9);
        double fahrenheit = MathOperations.celsiusToFahrenheit(10.0);
        double celsius = MathOperations.fahrenheitToCelsius(451);

        String result = "Результат:\nсумма = " + sum
                + "\nразница = " + difference
                + "\nпроизведение = " + produce
                + "\nделение = " + division
                + "\nмаксимальное число = " + max
                + "\nразница чисел = " + dif
                + "\nплощадь квадрата = " + sqm
                + "\nпериметр квадрата = " + perimeter
                + "\nминут в секундах = " + minutes
                + "\nсредняя скорость = " + speed
                + "\nгипотенуза = " + hypotenuse1 + ", " + hypotenuse2 + ", " + hypotenuse3
                + "\nрадиус = " + circleRadius
                + "\nпроцент = " + percent
                + "\nсельсий -> фаренгейт = " + fahrenheit
                + "\nфаренгейт -> цельсий = " + celsius;

        System.out.println(result);

    }

    public static int add(int x, int y) { // сумма двух чисел
        return x + y;
    }

    public static int subtract(int x, int y) { // разница двух чисел
        return x - y;
    }

    public static int multiply(int x, int y) {// произведение двух чисел
        return x * y;
    }

    public static double divide(int x, int y) {// результат деления в double двух чисел
        return ((double) x / y); // ПЕРЕВОД В ДРУГ ТИП ДАННЫХ
    }

    public static int findMax(int a, int b) { // максимум из двух чисел
        return Math.max(a, b);
    }

    public static int difference(int x, int y) { // разница чисел
        return Math.abs(x - y);
    }

    public static int squareArea(int side) { // расчет площади квадрата
        return side * side;
    }

    public static int squarePerimeter(int side) { // расчет периметра квадрата
        return side * 4;
    }

    public static int convertSecondsToMinutes(int seconds) { // конвертер сек в мин
        return seconds / 60;
    }

    public static double averageSpeed(double distance, double time) {// который возвращает среднюю скорость

        if (time <= 0.0) {
            return 0.0;
        } else {
            return distance / time;
        }
    }

    public static double findHypotenuse(double a, double b) {// для вычисления гипотенузы по теореме Пифагора: √(a² + b²)
        return a * a + b * b;
    }

    public static double circleCircumference(double radius) {// который возвращает длину окружности по формуле 2πr
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {// возвращает, какой процент от общего составляет часть. Пример: 25 из 200 → 12.5%
        if (total != 0.0) {
            return (part / total) * 100.0;
        } else {
            return 0.0;
        }
    }
    public static double celsiusToFahrenheit(double c) {// перевод в Фаренгейты: C × 9 / 5 + 32
        return c * 9 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double f) {// перевод в Цельсий: (F − 32) × 5 / 9
        return (f - 32) * 5 / 9;
    }
}