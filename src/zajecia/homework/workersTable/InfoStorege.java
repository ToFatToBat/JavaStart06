package zajecia.homework.workersTable;

public class InfoStorege {

    int employeeCount;

    Employee [] employees = new Employee[3];
    DataReader dataReader = new DataReader();


    public void addEmployee() {
        employees[employeeCount] = dataReader.employee;
        employeeCount++;
    }
}
