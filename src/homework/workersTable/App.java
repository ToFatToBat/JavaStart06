package homework.workersTable;

public class App {
    public static void main(String[] args) {

        DataReader dataReader = new DataReader();
        dataReader.noOfLoadings();

        // Ponizsza petle mozna zawsze wylaczyc patrzac stricte na tresc zadania
        for (Employee p : dataReader.infoStorege.employees) {
            System.out.println(p);
        }

       dataReader.salaryEmployeesSum();

    }
}

