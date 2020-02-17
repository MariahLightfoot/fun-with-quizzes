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

        ArrayList<String> answersForWhatIsTwoPlusTwo = new ArrayList<>();
        answersForWhatIsTwoPlusTwo.add("1 - 4");
        answersForWhatIsTwoPlusTwo.add("2 - 5");
        answersForWhatIsTwoPlusTwo.add("3 - 5");

        MultipleChoice whatIsTwoPlusTwo = new MultipleChoice("What is 2 + 2?", answersForWhatIsTwoPlusTwo, 1);

        Scanner userInputForMultipleChoice = new Scanner(System.in);
        whatIsTwoPlusTwo.printQuestion();
        whatIsTwoPlusTwo.printAnswerOptionsForMultipleChoice(answersForWhatIsTwoPlusTwo);
        System.out.println("Choose wisely: ");
        userInputForMultipleChoice.nextInt();

    }

}
