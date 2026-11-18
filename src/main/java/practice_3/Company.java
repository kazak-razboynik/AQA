package practice_3;
/**
 * Создайте класс Company с полями:
 * static String companyName — общее название для всех сотрудников
 * final int employeeID — уникальный идентификатор (нельзя менять)
 * String employeeName — имя сотрудника
 * Реализуйте конструктор, принимающий employeeID и employeeName,
 * статический метод printCompanyName(), геттеры и сеттеры для employeeName.
 * В main: создайте несколько сотрудников,
 * измените companyName и проверьте, что она изменилась для всех.
 * Попробуйте изменить employeeID — должно быть невозможно.
 */
public class Company {
    // поля
    static String companyName;
    final int employeeID;
    String employeeName;

    // конструктор
    Company(int newEmployeeID, String newEmployeeName){
        this.employeeID = newEmployeeID;
        this.employeeName = newEmployeeName;
    }

    // метод который пишет название компании
    static void printCompanyName(){
        System.out.println("Название компании: " + companyName);
    }

    // геттер и сеттер employeeName
    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String newEmployeeName){
        this.employeeName = newEmployeeName;
    }

    // сеттер companyName
    public static void setCompanyName(String newCompanyName){
        companyName = newCompanyName;
    }


}
