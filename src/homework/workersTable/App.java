package homework.workersTable;

public class App {
    public static void main(String[] args) {

        DataReader dataReader = new DataReader();
        InfoStorege infoStorege = new InfoStorege();

       dataReader.employeeLoader();
        System.out.println(infoStorege.employees[0]);
        System.out.println(infoStorege.employees[1]);

       dataReader.employeeLoader();
        System.out.println(infoStorege.employees[0]);
        System.out.println(infoStorege.employees[1]);



        for (Employee p : infoStorege.employees) {
            System.out.println(p);
        }

    }
}
