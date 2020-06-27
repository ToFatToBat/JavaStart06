package homework.workersTable;

public class App {
    public static void main(String[] args) {


        DataReader dataReader = new DataReader();
        EmployeeRepository employeeRepository = new EmployeeRepository();
        EmployeeCalculations employeeCalculations = new EmployeeCalculations();
        Loadings loadings = new Loadings();



         loadings.noOfLoadings ();


        for (int q = 0; q < loadings.getNoOfLoadingsResult(); q++) {
            employeeRepository.addEmployee(dataReader.employeeLoader());
        }


        // Ponizsza petle mozna zawsze wylaczyc patrzac stricte na tresc zadania
        for (Employee p : employeeRepository.employees) {
            System.out.println(p);
        }

        employeeCalculations.salaryEmployeesSum(employeeRepository.employees);


        employeeRepository.getEmployee(1);


    }






}

