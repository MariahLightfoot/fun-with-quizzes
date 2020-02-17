package com.company;

import java.util.ArrayList;

public class MultipleChoice extends Question{
    private ArrayList<String> multipleChoiceAnswerOptions;
    private int correctAnswer;
    private int multipleChoiceScore = 0;

    public MultipleChoice(String inquiry, ArrayList<String> multipleChoiceAnswerOptions, int correctAnswer) {
        super(inquiry);
        this.multipleChoiceAnswerOptions = multipleChoiceAnswerOptions;
        this.correctAnswer = correctAnswer;
    }

    public ArrayList<String> getMultipleChoiceAnswerOptions() {

        return multipleChoiceAnswerOptions;
    }

    public void setMultipleChoiceAnswerOptions(ArrayList<String> multipleChoiceAnswerOptions) {
        this.multipleChoiceAnswerOptions = multipleChoiceAnswerOptions;
    }

    public int getCorrectAnswer() {

        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {

        this.correctAnswer = correctAnswer;
    }

    public int getCorrectMultipleChoiceScore() {

        return multipleChoiceScore;
    }

    public int checkForCorrectMultipleChoiceAnswer(int userAnswer){
        if(userAnswer == correctAnswer){
            this.multipleChoiceScore += 1;
        }
        return this.multipleChoiceScore;
    }
}
