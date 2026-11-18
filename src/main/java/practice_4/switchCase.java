package practice_4;

public class switchCase {
    public static void switch1(int n){
        String dayOfWeek;

        switch (n) {
            case 1: dayOfWeek = "Понедельник";
                break;
            case 2: dayOfWeek = "Вторник";
                break;
            case 3: dayOfWeek = "Среда";
                break;
            case 4: dayOfWeek = "Четверг";
                break;
            case 5: dayOfWeek = "Пятница";
                break;
            case 6: dayOfWeek = "Суббота";
                break;
            case 7: dayOfWeek = "Воскресение";
                break;
            default: dayOfWeek = "Надо было написать число от 1 до 7";
        }

        System.out.println(dayOfWeek);
    }

    public static void switch2(int n){
        /*
        if (n >= 1 && n <= 5) {
            System.out.println("цена билета 300 рублей");
        } else if (n > 5 && n <= 7) {
            System.out.println("цена билета 450 рублей");
        } else {
            System.out.println("Надо было написать число от 1 до 7");
        }
         */
        switch (n) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("цена билета 300 рублей");
                break;
            case 6:
            case 7: System.out.println("цена билета 450 рублей");
                break;
            default: System.out.println("надо было написать число от 1 до 7");
                break;
        }
    }

    public static void switch3(int n){
        String text;
        if (n >= 0 && n <= 100) {
            if (n >= 90) {
                text = "A";
            } else if (n >= 80 && n < 90) {
                text = "B";
            } else if (n >= 70 && n < 80) {
                text = "C";
            } else if (n >= 60 && n < 70) {
                text = "D";
            } else {
                text = "F";
            }
        } else {
            text = "Надо было написать число от 0 до 100";
        }

        System.out.println(text);
    }

    public static void switch4(String word){
        String text;
        switch (word) {
            case "start": text = "Система запущена";
                break;
            case "stop": text = "Система остановлена";
                break;
            case "restart": text = "Система перезапущена";
                break;
            case "status": text = "Система работает";
                break;
            default: text = "Надо было ввести команду \"start\", \"stop\", \"restart\" или \"status\".";
        }
        System.out.println(text);
    }

    public static void switch5(int n1, int n2, String str){
        switch (str) {
            case "+": System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case "-": System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case "*": System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            case "/": System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                break;
            default: System.out.println("Надо было написать арифметические оператор +, -, * или /");
        }
    }
}
