package Practice_3;
/**
 * Создайте класс GameSettings с полями:
 * static int maxPlayers — общее ограничение игроков
 * final String gameName — название (нельзя менять)
 * int currentPlayers — сколько игроков в игре сейчас
 * Реализуйте конструктор,
 * статический метод setMaxPlayers(int),
 * метод addPlayer() — добавляет 1 игрока,
 * метод printGameStatus() — выводит название, текущее и максимальное количество игроков.
 * В main: создайте 2 игры, измените maxPlayers, добавьте игроков и выведите статус.
 */
public class GameSettings {
    // поля
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    // конструктор
    GameSettings(String newGameName, int newCurrentPlayers, int newMaxPlayers){
        this.gameName = newGameName;
        this.currentPlayers = newCurrentPlayers;
        this.maxPlayers = newMaxPlayers;
    }

    // метод устанавливающий максимальное кол-во игроков
    public void setMaxPlayers(int newMaxPlayers){
        this.maxPlayers = newMaxPlayers;
    }

    // метод добавляющий 1 игрока к игре
    public void addPlayer(){
        this.currentPlayers++;
    }

    // метод выводит инфо игры (название, текущее и макс. кол-во игроков)
    public void printGameStatus(){
        System.out.println("Название: " + gameName);
        System.out.println("Текущее кол-во игроков: " + currentPlayers);
        System.out.println("Макс. кол-во игроков: " + maxPlayers);
    }
}
