package zajecia.liczby;

import java.util.Scanner;

public class DataInput {
    Scanner sc = new Scanner(System.in);
    int a;
    int b;
    int c;

    public void numberInput() {
        System.out.println("Podaj pierwsza liczbe:");
        a = sc.nextInt();
        System.out.println("Podaj druga liczbe:");
        b = sc.nextInt();
        System.out.println("Podaj trzecia liczbe:");
        c = sc.nextInt();
    }
}
