package zajecia.homework.workersTable;

import javax.xml.crypto.Data;

public class App {
    public static void main(String[] args) {

        DataReader dataReader = new DataReader();
        InfoStorege infoStorege = new InfoStorege();

       dataReader.employeeLoader();
       dataReader.employeeLoader();



        for (Employee p : infoStorege.employees) {
            System.out.println(p);
        }

    }
}
