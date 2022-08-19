package Work;

import org.w3c.dom.ls.LSOutput;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee worker1 = new Employee(1467, "Zuganov", 35, 28600, "Human Resources");
        Employee worker2 = new Employee(3494, "Abramian", 43, 34900, "Financial Inclusion");

        Employee.info(worker1);
        System.out.println();
        Employee.info(worker2);
        System.out.println();

        Employee.doubleSalary(worker1);
        Employee.doubleSalary(worker2);

        System.out.println(worker1.salary);
        System.out.println();
        System.out.println(worker2.salary);
    }
}
