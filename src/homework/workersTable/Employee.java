package homework.workersTable;

public class Employee {
    private String name;
    private String surname;
    private int salary;



    public Employee() {
    }

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }



    public int getSalary() {
        return salary;
    }




    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
