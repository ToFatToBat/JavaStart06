package homework.workersTable;

import java.util.Scanner;

public class DataReader {
    int noOfLoadingsResult;

    Scanner sc = new Scanner(System.in);
    EmployeeRepository employeeRepository = new EmployeeRepository();


    public void noOfLoadings() {
        System.out.println("Podaj liczbe pracownikow do wprowadzenia:");
        noOfLoadingsResult = sc.nextInt();
        sc.nextLine();


    }

    public Employee employeeLoader() {
        System.out.println("Podaj imie pracownika:");
        String name = sc.nextLine();
        System.out.println("Podaj nazwisko pracownika:");
        String surname = sc.nextLine();
        System.out.println("Podaj wysokosc wyplaty:");
        int salary = sc.nextInt();
        sc.nextLine();
        Employee employee = new Employee(name, surname, salary);
        return employee;
    }



}
