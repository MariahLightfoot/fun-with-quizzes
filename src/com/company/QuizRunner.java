package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {

    public static void main(String[] args) {

        //new multiple choice question
        ArrayList<String> answerChoicesForWhatIsTwoPlusTwo = new ArrayList<>();
        answerChoicesForWhatIsTwoPlusTwo.add("1 - 4");
        answerChoicesForWhatIsTwoPlusTwo.add("2 - 5");
        answerChoicesForWhatIsTwoPlusTwo.add("3 - 5");

        MultipleChoice whatIsTwoPlusTwo = new MultipleChoice("What is 2 + 2?", answerChoicesForWhatIsTwoPlusTwo, 1);

        //new check box question
        ArrayList<String> answerChoicesForWhatIsAShortenedNameForWilliam = new ArrayList<>();
        answerChoicesForWhatIsAShortenedNameForWilliam.add("1 - Will");
        answerChoicesForWhatIsAShortenedNameForWilliam.add("2 - Bill");
        answerChoicesForWhatIsAShortenedNameForWilliam.add("3 - Ed");

        ArrayList<String> correctAnswersForWhatIsAShortenedNameForWilliam = new ArrayList<>();
        correctAnswersForWhatIsAShortenedNameForWilliam.add("1");
        correctAnswersForWhatIsAShortenedNameForWilliam.add("2");

        CheckBox whatIsAShortenedNameForWilliam = new CheckBox("What is a shortened name for William?", answerChoicesForWhatIsAShortenedNameForWilliam, correctAnswersForWhatIsAShortenedNameForWilliam);

        //new true false question
        TrueFalse theSkyIsBlue = new TrueFalse("Is the sky blue?", 1);

        //Creating new quiz
        ArrayList<Question> quizQuestionsForQuizOne = new ArrayList<>();
        quizQuestionsForQuizOne.add(whatIsTwoPlusTwo);
        quizQuestionsForQuizOne.add(whatIsAShortenedNameForWilliam);
        quizQuestionsForQuizOne.add(theSkyIsBlue);

        Quiz quizOne = new Quiz(quizQuestionsForQuizOne);

        quizOne.printQuizQuestionsAndAnswersAndCollectUserInput(quizQuestionsForQuizOne, answerChoicesForWhatIsTwoPlusTwo, answerChoicesForWhatIsAShortenedNameForWilliam);

        quizOne.gradeQuiz(quizQuestionsForQuizOne);


    }

}
