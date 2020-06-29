package homework.workersTable;

public class App {
    public static void main(String[] args) {


        DataReader dataReader = new DataReader();
        EmployeeCalculations employeeCalculations = new EmployeeCalculations();
        Loadings loadings = new Loadings();
        int nrOfLoadings = loadings.noOfLoadings();
        EmployeeRepository employeeRepository = new EmployeeRepository(nrOfLoadings);



        for (int q = 0; q < nrOfLoadings; q++) {
            employeeRepository.addEmployee(dataReader.employeeLoader());
        }


        // Ponizsza petle mozna zawsze wylaczyc patrzac stricte na tresc zadania
        for (Employee p : employeeRepository.getEmployees()) {
            System.out.println(p);
        }

        employeeCalculations.salaryEmployeesSum(employeeRepository.getEmployees());


        employeeRepository.showEmployee(1);


    }


}

