package homework.workersTable;

public class EmployeeRepository {

    private int employeeCount;
    DataReader dataReader = new DataReader();
    Employee[] employees = new Employee[3];


    public void addEmployee(Employee employee) {
        employees[employeeCount] = employee;
        employeeCount++;
    }

    public void salaryEmployeesSum() {
        int result = 0;
        int i = 0;
        while (dataReader.employeeRepository.employees[i] != null) {
            result += dataReader.employeeRepository.employees[i].getSalary();
            i++;
        }
        System.out.println(result);
    }
}
