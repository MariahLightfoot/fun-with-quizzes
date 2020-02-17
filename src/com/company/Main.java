package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //make quiz
        //make instances of questions
        //add them to quiz
        //check answer

        ArrayList<String> answerChoicesForWhatIsTwoPlusTwo = new ArrayList<>();
        answerChoicesForWhatIsTwoPlusTwo.add("1 - 4");
        answerChoicesForWhatIsTwoPlusTwo.add("2 - 5");
        answerChoicesForWhatIsTwoPlusTwo.add("3 - 5");

        MultipleChoice whatIsTwoPlusTwo = new MultipleChoice("What is 2 + 2?", answerChoicesForWhatIsTwoPlusTwo, 1);

        Scanner inputForMultipleChoice = new Scanner(System.in);
        whatIsTwoPlusTwo.printQuestion();
        whatIsTwoPlusTwo.printAnswerOptions(answerChoicesForWhatIsTwoPlusTwo);
        System.out.println("Choose wisely: ");
        int userInputForMultipleChoice = inputForMultipleChoice.nextInt();

        whatIsTwoPlusTwo.checkForCorrectMultipleChoiceAnswer(userInputForMultipleChoice);

    }

}
