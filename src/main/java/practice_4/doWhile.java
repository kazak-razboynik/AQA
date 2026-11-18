package practice_4;

import java.util.Scanner;

public class doWhile {
    public static void doWhile1() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Введи положительно число:");
            num = scanner.nextInt();
        } while (num <= 0);
    }

    public static void doWhile2() {
        Scanner scanner = new Scanner(System.in);
        int password = 12345;
        int num;
        do {
            System.out.println("Введите пароль:");
            num = scanner.nextInt();
        } while (password != num);
    }

    public static void doWhile3() {
        int count = 1;
        do {
            System.out.println(count);
            count++;
        } while (count <= 10);
    }

    public static void doWhile4() {
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("Напишите команду для завершения работы:");
            command = scanner.next();
        } while (!command.equals("exit"));
    }

    public static void doWhile5() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Напишите число для подсчета кол-ва цифр в нем:");
        int num = scanner.nextInt();

        do {
            num = num / 10;
            count++;
        } while (num > 0);

        System.out.println(count);

    }
}
