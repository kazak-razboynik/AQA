package Practice_3;

public class Main {
    public static void main(String[] args){
        //В main: создайте несколько объектов, измените имя у одного и выведите информацию.
        Person carlG = new Person("Карл", "Грин", "127-129-89");
        Person liliO = new Person("Лили", "О'Коннел", "146-987-90");
        Person jackD = new Person("Джек", "Ди", "133-543-55");

        carlG.setFirstName("Карлос");
        carlG.printPersonInfo();
    }
}
