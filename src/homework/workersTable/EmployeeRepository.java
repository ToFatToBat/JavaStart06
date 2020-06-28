package homework.workersTable;

public class EmployeeRepository {

    private int employeeCount;
    private Employee[] employees = new Employee[3];


    public Employee[] getEmployees() {
        return employees;
    }


    public void addEmployee(Employee employee) {
        employees[employeeCount] = employee;
        employeeCount++;
    }

    public void showEmployee(int employeeNumberOnList) {
        System.out.println(employees[employeeNumberOnList]);
    }

}
