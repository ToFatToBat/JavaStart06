package homework.workersTable;

public class EmployeeRepository {

    private int employeeCount;

    Employee[] employees = new Employee[3];


    public void addEmployee(Employee employee) {
        employees[employeeCount] = employee;
        employeeCount++;
    }

    public void getEmployee(int employeeNumberOnList) {
        System.out.println(employees[employeeNumberOnList]);
            }

}
