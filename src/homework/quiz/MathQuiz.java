package homework.quiz;

import java.util.Scanner;

public class MathQuiz {

    Scanner sc = new Scanner(System.in);
    boolean question1Result;
    boolean question2Result;
    boolean question3Result;


    public void quiz() {
        question1Result = question1();
        question2Result = question2();
        question3Result = question3();
        sc.close();
    }

    public boolean question1() {
        System.out.println("Podaj wynik mnozenia 3*5:");
        int result = sc.nextInt();
        sc.nextLine();
        if (result == 15) {
            return result == 15;
        } else return result == 15;
    }

    public boolean question2() {
        System.out.println("Podaj pole kwadratu o boku 12");
        int result = sc.nextInt();
        sc.nextLine();
        if (result == 144) {
            return result == 144;
        } else return result == 144;
    }

    public boolean question3() {
        System.out.println("jaki jest pierwiastek kwadratowy z liczby 15129?");
        int result = sc.nextInt();
        sc.nextLine();
        if (result == 123) {
            return result == 123;
        } else return result == 123;

    }

}
