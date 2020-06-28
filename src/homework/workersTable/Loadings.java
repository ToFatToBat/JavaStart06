package homework.workersTable;

import java.util.Scanner;

public class Loadings {

    Scanner sc = new Scanner(System.in);


    public int noOfLoadings() {
        System.out.println("Podaj liczbe pracownikow do wprowadzenia:");
        return sc.nextInt();

    }
}
