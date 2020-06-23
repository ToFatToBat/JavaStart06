package homework.workersTable;

import java.util.Scanner;

public class DataReader {
    Scanner sc = new Scanner(System.in);
    InfoStorege infoStorege = new InfoStorege();




    public void noOfLoadings () {
        System.out.println("Podaj liczbe pracownikow do wprowadzenia:");
        int w = sc.nextInt();
        sc.nextLine();
        for (int q = 0; q < w; q++){
            employeeLoader();
        }
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
        infoStorege.addEmployee(employee);
        return employee;
    }


    public void salaryEmployeesSum () {
        int result = 0;
        int i = 0;
        while (infoStorege.employees[i] != null){
            result += infoStorege.employees[i].getSalary();
            i++;
        }
        System.out.println(result);
    }
}
