package homework.quiz;

import java.util.Scanner;

public class MathQuiz {

    Scanner sc = new Scanner(System.in);
    private boolean question1Result;
    private boolean question2Result;
    private boolean question3Result;
    private int quizResult;

    public boolean isQuestion1Result() {
        return question1Result;
    }

    public boolean isQuestion2Result() {
        return question2Result;
    }

    public boolean isQuestion3Result() {
        return question3Result;
    }

    public void quiz() {
        question1();
        question2();
        question3();
    }

    public boolean question1() {
        System.out.println("Podaj wynik mnozenia 3*5:");
        int result = sc.nextInt();
        sc.nextLine();
        if (result == 15) {
            question1Result = true;
        } else question1Result = false;
        return question1Result;
    }

    public boolean question2() {
        System.out.println("Podaj pole kwadratu o boku 12");
        int result = sc.nextInt();
        sc.nextLine();
        if (result == 144) {
            question2Result = true;
        } else question2Result = false;
        return question2Result;
    }

    public boolean question3() {
        System.out.println("jaki jest pierwiastek kwadratowy z liczby 15129?");
        int result = sc.nextInt();
        sc.nextLine();
        if (result == 123) {
            question3Result = true;
        } else question3Result = false;
        return question3Result;

    }

}
