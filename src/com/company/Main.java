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

        /////Testing multiple choice class
//        ArrayList<String> answerChoicesForWhatIsTwoPlusTwo = new ArrayList<>();
//        answerChoicesForWhatIsTwoPlusTwo.add("1 - 4");
//        answerChoicesForWhatIsTwoPlusTwo.add("2 - 5");
//        answerChoicesForWhatIsTwoPlusTwo.add("3 - 5");
//
//        MultipleChoice whatIsTwoPlusTwo = new MultipleChoice("What is 2 + 2?", answerChoicesForWhatIsTwoPlusTwo, 1);
//
//        Scanner inputForMultipleChoice = new Scanner(System.in);
//        whatIsTwoPlusTwo.printQuestion();
//        whatIsTwoPlusTwo.printAnswerOptions(answerChoicesForWhatIsTwoPlusTwo);
//        System.out.println("Choose wisely: ");
//        int userInputForMultipleChoice = inputForMultipleChoice.nextInt();
//
//        whatIsTwoPlusTwo.checkForCorrectMultipleChoiceAnswer(userInputForMultipleChoice);


        /////Testing check box class
        ArrayList<String> answerChoicesForWhatIsAShortenedNameForWilliam = new ArrayList<>();
        answerChoicesForWhatIsAShortenedNameForWilliam.add("1 - Will");
        answerChoicesForWhatIsAShortenedNameForWilliam.add("2 - Bill");
        answerChoicesForWhatIsAShortenedNameForWilliam.add("3 - Ed");

        ArrayList<String> correctAnswersForWhatIsAShortenedNameForWilliam = new ArrayList<>();
        correctAnswersForWhatIsAShortenedNameForWilliam.add("1");
        correctAnswersForWhatIsAShortenedNameForWilliam.add("2");

        CheckBox whatIsAShortenedNameForWilliam = new CheckBox("What is a shortened name for William?", answerChoicesForWhatIsAShortenedNameForWilliam, correctAnswersForWhatIsAShortenedNameForWilliam);

        Scanner inputForCheckBox = new Scanner(System.in);
        whatIsAShortenedNameForWilliam.printQuestion();
        whatIsAShortenedNameForWilliam.printAnswerOptions(answerChoicesForWhatIsAShortenedNameForWilliam);
        System.out.println("Choose wisely: ");
        String userInputForCheckBox = inputForCheckBox.nextLine();

        whatIsAShortenedNameForWilliam.checkForCorrectCheckBoxAnswer(userInputForCheckBox);

        System.out.println("Are there any other correct answers? ");
        userInputForCheckBox = inputForCheckBox.nextLine();

        whatIsAShortenedNameForWilliam.checkForCorrectCheckBoxAnswer(userInputForCheckBox);

    }

}
