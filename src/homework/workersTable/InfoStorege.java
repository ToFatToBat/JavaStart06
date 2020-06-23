package homework.workersTable;

public class InfoStorege {

    int employeeCount;

    Employee [] employees = new Employee[3];


    public void addEmployee(Employee employee) {
        employees[employeeCount] = employee;
        employeeCount++;
    }
}
