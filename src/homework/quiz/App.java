package homework.quiz;

import javax.xml.crypto.Data;

public class App {
    public static void main(String[] args) {
        MathQuiz mathQuiz = new MathQuiz();
        boolean[] database = new boolean[3];

        mathQuiz.quiz();

        database[0] = mathQuiz.question1Result;
        database[1] = mathQuiz.question2Result;
        database[2] = mathQuiz.question3Result;

        System.out.println(database[0]);
        System.out.println(database[1]);
        System.out.println(database[2]);

        int quizResult = 0;
        for (int i = 0; i < 3; i++) {
            if (database[i] == true) {
                quizResult++;
            }
        }

        System.out.println("Twoj wynik quizu to: " + quizResult + "/3");
    }
}
