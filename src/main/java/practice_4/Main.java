package practice_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ifElse.ifElse1(scanner.nextInt());
        ifElse.ifElse2(scanner.nextInt(), scanner.nextInt());
        ifElse.ifElse3(scanner.nextInt());
        ifElse.ifElse4(scanner.nextInt());
        ifElse.ifElse5(scanner.nextInt());
        ifElse.ifElse6(scanner.nextInt());

        switchCase.switch1(scanner.nextInt());
        switchCase.switch2(scanner.nextInt());
        switchCase.switch3(scanner.nextInt());
        switchCase.switch4(scanner.next());
        switchCase.switch5(scanner.nextInt(), scanner.nextInt(), scanner.next());

        forIf.for1();
        forIf.for2(scanner.nextInt());
        forIf.for3(scanner.nextInt());
        forIf.for4(scanner.nextInt());
        forIf.for5();

        whileIf.while1(scanner.nextInt());
        whileIf.while2(scanner.nextInt());
        whileIf.while3(scanner.nextInt());

        doWhile.doWhile1();
        doWhile.doWhile2();
        doWhile.doWhile3();
        doWhile.doWhile4();
        doWhile.doWhile5();

        breakContinue.break1();
        breakContinue.break2();
        breakContinue.break3();
        breakContinue.break4();
    }
}
