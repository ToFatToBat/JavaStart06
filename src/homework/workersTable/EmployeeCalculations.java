package homework.workersTable;

public class EmployeeCalculations {

    public void salaryEmployeesSum(EmployeeRepository employeeRepository) {
        int result = 0;
        int i = 0;
        while ( employeeRepository.employees[i] != null) {
            result += employeeRepository.employees[i].getSalary();
            i++;
        }
        System.out.println(result);
    }
}
