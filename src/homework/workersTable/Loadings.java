package homework.workersTable;

import java.util.Scanner;

public class Loadings {

    private int noOfLoadingsResult;

  Scanner sc = new Scanner(System.in);

    public int getNoOfLoadingsResult() {
        return noOfLoadingsResult;
    }

    public void   noOfLoadings() {

        System.out.println("Podaj liczbe pracownikow do wprowadzenia:");
        noOfLoadingsResult = sc.nextInt();
        sc.nextLine();
    }
}
