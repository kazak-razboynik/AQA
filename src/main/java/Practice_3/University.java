package Practice_3;
/**
 * Создайте класс University с полями:
 * static String universityName — общее имя университета
 * final int studentID — уникальный ID
 * String studentName
 * Реализуйте конструктор для studentID и studentName,
 * статический метод changeUniversityName(String newName),
 * геттер для studentName,
 * метод printStudentInfo() — выводит имя, ID и университет.
 * В main: создайте 3 студента,измените название университета и выведите данные.
 */
public class University {
    // поля
    static String universityName;
    final int studentID;
    String studentName;

    // конструктор
    University(int newStudentID, String newStudentName){
        this.studentID = newStudentID;
        this.studentName = newStudentName;
    }

    // метод смены названия университета
    static void changeUniversityName(String newUniversityName){
        universityName = newUniversityName;
    }

    // геттер
    public String getUniversityName(){
        return universityName;
    }

    // метод выводящий инфо о студенте и его университете
    public void printStudentInfo(){
        System.out.println("Имя: " +  studentName);
        System.out.println("ID: " + studentID);
        System.out.println("Университет: " + universityName);
    }
}
