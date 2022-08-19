package Work;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

     Employee(int id2, String surname2, int age2, double salary2, String department2){
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    public static void doubleSalary(Employee employee){
        employee.salary = employee.salary*2;
    }
    static void info(Employee employee){
        System.out.println(employee.id);
        System.out.println(employee.surname);
        System.out.println(employee.age);
        System.out.println(employee.salary);
        System.out.println(employee.department);
    }
}
