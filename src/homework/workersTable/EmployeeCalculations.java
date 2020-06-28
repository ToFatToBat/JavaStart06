package homework.workersTable;

public class EmployeeCalculations {

    public void salaryEmployeesSum(Employee[] employees) {
        int result = 0;
        int i = 0;
        while (employees[i] != null) {
            result += employees[i].getSalary();
            i++;
        }
        System.out.println(result);
    }
}
