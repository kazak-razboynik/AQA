package practice_4;

public class ifElse {
    public static void ifElse1(int n){
        if (n > 0) {

            System.out.println("Число положительное");
        } else if (n < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    public static void ifElse2(int n1, int n2){
        if (n1 > n2) {
            System.out.println("Первое число больше второго");
        } else if (n1 < n2) {
            System.out.println("Второе число больше первого");
        } else {
            System.out.println("Числа равны");
        }
    }

    public static void ifElse3(int n){
        if (n == 5) {
            System.out.println("Отлично");
        } else if (n == 4) {
            System.out.println("Хорошо");
        } else if (n == 3) {
            System.out.println("Удовлетворительно");
        } else if (n == 1 || n == 2) {
            System.out.println("Неудовлетворительно");
        } else {
            System.out.println("Надо было написать число от 1 до 5");
        }
    }

    public static void ifElse4(int n){
        if (n % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

    public static void ifElse5(int n){
        if (n > 17 && n < 65) {
            System.out.println("Скидка 25%");
        } else if (n > 64) {
            System.out.println("Скидка 30%");
        } else {
            System.out.println("Без скидки");
        }
    }

    public static void ifElse6(int n){
        if (n >= 0 && n <= 100) {
            if (n >= 90) {
                System.out.println("Отлично");
            } else if (n >= 75 && n < 90) {
                System.out.println("Хорошо");
            } else if (n > 59 && n < 75) {
                System.out.println("Удовлетворительно");
            } else {
                System.out.println("Неудовлетворительно");
            }
        } else {
            System.out.println("Надо было написать число от 0 до 100");
        }
    }
}
