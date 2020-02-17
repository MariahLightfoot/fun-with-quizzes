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

    public ArrayList<String> getCheckBoxAnswerOptions() {

        return checkBoxAnswerOptions;
    }

    public void setCheckBoxAnswerOptions(ArrayList<String> checkBoxAnswerOptions) {
        this.checkBoxAnswerOptions = checkBoxAnswerOptions;
    }

    public ArrayList<String> getCorrectCheckBoxAnswer() {

        return correctCheckBoxAnswers;
    }

    public void setCorrectCheckBoxAnswer(ArrayList<String> correctCheckBoxAnswer) {

        this.correctCheckBoxAnswers = correctCheckBoxAnswer;
    }

    public int getCheckBoxScore() {

        return checkBoxScore;
    }

    public int checkForCorrectCheckBoxAnswer(String userAnswer){
        if(correctCheckBoxAnswers.contains(userAnswer)){
            this.checkBoxScore += 1;
        }
        System.out.println(checkBoxScore);
        return this.checkBoxScore;
    }
}
