package practice_2;
/*
Класс StudentGroup
Создайте класс StudentGroup с полями groupName и studentCount.
Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о группе и количестве студентов.
В main измените число студентов и выведите информацию.
 */
public class StudentGroup {
    // поля
    String groupName;
    int studentCount;

    // конструктор
    StudentGroup(String someGroupName, int someStudentCount){
        this.groupName = someGroupName;
        this.studentCount = someStudentCount;
    }

    // геттеры
    String getGroupName(){
        return this.groupName;
    }
    int getStudentCount(){
        return this.studentCount;
    }

    // сеттеры
    void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }
    void setStudentCount(int newStudentCount){
        this.studentCount = newStudentCount;
    }

    // метод выводящий информацию о группах студентов и количестве человек в группе
    void print(){
        System.out.println("Группа " + groupName + ", количество учеников " + studentCount);
    }
}
