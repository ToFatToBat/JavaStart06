package homework.quiz;

import javax.xml.crypto.Data;

public class App {
    public static void main(String[] args) {
        MathQuiz mathQuiz = new MathQuiz();
        Database [] database = new Database[3];

        mathQuiz.quiz();
        database[0] = new Database( mathQuiz.isQuestion1Result());
        database[1] = new Database( mathQuiz.isQuestion2Result());
        database[2] = new Database( mathQuiz.isQuestion3Result());

        System.out.println(database[0].isResult());
        System.out.println(database[1].isResult());
        System.out.println(database[2].isResult());



    }
}
