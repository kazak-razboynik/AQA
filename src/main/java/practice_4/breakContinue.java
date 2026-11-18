package practice_4;

import java.util.Scanner;

/**
 * 4. Ввод строк до команды "stop" (использовать break)
 * Задача:
 * Программа должна запрашивать строки у пользователя и завершаться только тогда, когда введена команда "stop".
 * Методы и конструкции:
 * Scanner
 * while (true)
 * метод .equals("stop")
 * break
 * System.out.println()
 */
public class breakContinue {
    public static void break1(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            int n1 =  scanner.nextInt();
            int n2 = scanner.nextInt();
            if (n1 < 0 || n2 < 0){
                break;
            } else {
                int sum = n1 + n2;
                System.out.println(sum);
            }
        }
    }

    public static void break2(){
        for (int i = 1; i <= 20; i++){
            if (i % 3 == 0) continue;
            else {
                System.out.println(i);
            }
        }
    }

    public static void break3(){
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int num;

        while (count <= 5){
            count++;
            num = scanner.nextInt();

            if (num < 0) {
                continue;
            } else {
                System.out.println(num);
            }
        }
    }

    public static void break4(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите строку:");

            String str = scanner.next();

            if (str.equals("stop")) {
                break;
            }
        }
    }
}
