package homework.workersTable;

import java.util.Scanner;

public class DataReader {
    Scanner sc = new Scanner(System.in);
    InfoStorege infoStorege = new InfoStorege();

    public Employee employeeLoader() {
        System.out.println("Podaj imie pracownika:");
        String name = sc.nextLine();
        System.out.println("Podaj nazwisko pracownika:");
        String surname = sc.nextLine();
        System.out.println("Podaj wysokosc wyplaty:");
        int salary = sc.nextInt();
        sc.nextLine();

        Employee employee = new Employee(name, surname, salary);
        infoStorege.addEmployee(employee);
        return employee;
    }
}
