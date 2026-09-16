package practice_2;

public class Student {
    // поля
    int age;
    String name;

    // конструктор
    Student(int someAge, String someName){
        this.age = someAge;
        this.name = someName;
    }

    //геттер для поля age
    int getAge(){
        return this.age;
    }

    //геттер для поля name
    String getName(){
        return this.name;
    }

    //сеттер для поля age
    void setAge(int newAge){
        this.age = newAge;
    }

    //сеттер для поля name
    void setName(String newName){
        this.name = newName;
    }

    void printAge(){
        System.out.println(this.age +  " " + this.name );
    }
}
