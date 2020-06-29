package homework.workersTable;

public class EmployeeRepository {

    private int employeeCount;


    private Employee[] employees;

    public EmployeeRepository(int employeeSize) {
        this.employees = new Employee[employeeSize];
    }

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
