package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private int score = 0;
    private ArrayList<Question> quizQuestions;

    public Quiz(ArrayList<Question> quizQuestions){
        this.quizQuestions = quizQuestions;

    }

    public void printQuizQuestionsAndAnswersAndCollectUserInput(ArrayList<Question> quizQuestionArray, ArrayList<String> multipleChoiceAnswers, ArrayList<String> checkBoxAnswers){
        System.out.println("Hello! Please answer the quiz questions by selecting the number that corresponds to the correct answer!");

        for (Question quizQuestion : quizQuestionArray) {
            System.out.println(quizQuestion.getInquiry());

            if(quizQuestion instanceof MultipleChoice){
                quizQuestion.printAnswerOptions(multipleChoiceAnswers);

                Scanner inputForMultipleChoice = new Scanner(System.in);
                System.out.println("Choose wisely: ");
                int userInputForMultipleChoice = inputForMultipleChoice.nextInt();
                ((MultipleChoice) quizQuestion).checkForCorrectMultipleChoiceAnswer(userInputForMultipleChoice);

            } else if(quizQuestion instanceof CheckBox){
                quizQuestion.printAnswerOptions(checkBoxAnswers);

                Scanner inputForCheckBox = new Scanner(System.in);
                System.out.println("Choose wisely: ");
                String userInputForCheckBox = inputForCheckBox.nextLine();
                ((CheckBox) quizQuestion).checkForCorrectCheckBoxAnswer(userInputForCheckBox);

                System.out.println("Are there any other correct answers? ");
                userInputForCheckBox = inputForCheckBox.nextLine();
                ((CheckBox) quizQuestion).checkForCorrectCheckBoxAnswer(userInputForCheckBox);

                System.out.println("What about the last one? ");
                userInputForCheckBox = inputForCheckBox.nextLine();
                ((CheckBox) quizQuestion).checkForCorrectCheckBoxAnswer(userInputForCheckBox);

            } else if(quizQuestion instanceof TrueFalse) {
                System.out.println("1 - True");
                System.out.println("1 - False");

                Scanner inputForTrueFalse = new Scanner(System.in);
                System.out.println("Choose wisely: ");
                int userInputForTrueFalse = inputForTrueFalse.nextInt();
                ((TrueFalse) quizQuestion).checkForCorrectTrueFalseAnswer(userInputForTrueFalse);

            }
        }
    }

    public void gradeQuiz(ArrayList<Question> quizQuestionArray){

        for (Question question : quizQuestionArray) {
            if (question instanceof MultipleChoice) {
                this.score += ((MultipleChoice) question).getCorrectMultipleChoiceScore();
            } else if (question instanceof CheckBox) {
                this.score += ((CheckBox) question).getCheckBoxScore();
            } else if (question instanceof TrueFalse) {
                this.score += ((TrueFalse) question).getTrueFalseScore();
            }
        }
        System.out.println(this.score);
    }
}
