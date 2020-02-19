package com.company;

import java.util.ArrayList;

public class CheckBox extends Question{
    private ArrayList<String> checkBoxAnswerOptions;
    private ArrayList<String> correctCheckBoxAnswers;
    private int checkBoxScore = 0;

    public CheckBox(String inquiry, ArrayList<String> checkBoxAnswerOptions, ArrayList<String> correctCheckBoxAnswers) {
        super(inquiry);
        this.checkBoxAnswerOptions = checkBoxAnswerOptions;
        this.correctCheckBoxAnswers = correctCheckBoxAnswers;
    }

    public int getCheckBoxScore() {

        return checkBoxScore;
    }

    public int checkForCorrectCheckBoxAnswer(String userAnswer){

        if(correctCheckBoxAnswers.contains(userAnswer)){
            System.out.println("Correct!");
            this.checkBoxScore += 1;
        } else if (userAnswer.toLowerCase().equals("nope")){
            System.out.println("Ok!");
        } else {
            System.out.println("Sorry, that is incorrect");
        }

        return this.checkBoxScore;
    }
}
