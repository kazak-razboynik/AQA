package practice_2;
/*
Класс BankAccount
Создайте класс BankAccount с полями owner и balance.
Реализуйте конструктор, геттеры, сеттер для владельца, методы deposit(amount) и withdraw(amount) и метод printBalance().
В main внесите деньги, снимите и выведите баланс.
 */

public class BankAccount {
    // поля
    String owner;
    int balance;

    // конструктор
    BankAccount(String someOwner, int someBalance) {
        this.owner = someOwner;
        this.balance = someBalance;
    }

    // геттер поля owner
    String getOwner(){
        return this.owner;
    }

    // геттер поля balance
    int getBalance(){
        return this.balance;
    }

    // сеттер поля owner
    void setOwner(String newOwner){
        this.owner = newOwner;
    }

    // метод внесения депозита
    void deposit(int amount){
        this.balance += amount;
    }

    // метод снятия с баланса
    void withdraw(int amount){
        this.balance -= amount;
    }

    // метод вывода информации об остатке средств на балансе
    void printBalance(){
        System.out.println("Баланс счета: " + balance);
    }
}
