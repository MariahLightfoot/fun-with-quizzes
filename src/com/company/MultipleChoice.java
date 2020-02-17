package com.company;

import java.util.ArrayList;

public class MultipleChoice extends Question{
    private ArrayList<String> multipleChoiceAnswerOptions;
    private int correctMultipleChoiceAnswer;
    private int multipleChoiceScore = 0;

    public MultipleChoice(String inquiry, ArrayList<String> multipleChoiceAnswerOptions, int correctMultipleChoiceAnswer) {
        super(inquiry);
        this.multipleChoiceAnswerOptions = multipleChoiceAnswerOptions;
        this.correctMultipleChoiceAnswer = correctMultipleChoiceAnswer;
    }

    public ArrayList<String> getMultipleChoiceAnswerOptions() {

        return multipleChoiceAnswerOptions;
    }

    public void setMultipleChoiceAnswerOptions(ArrayList<String> multipleChoiceAnswerOptions) {
        this.multipleChoiceAnswerOptions = multipleChoiceAnswerOptions;
    }

    public int getCorrectMultipleChoiceAnswer() {

        return correctMultipleChoiceAnswer;
    }

    public void setCorrectMultipleChoiceAnswer(int correctMultipleChoiceAnswer) {

        this.correctMultipleChoiceAnswer = correctMultipleChoiceAnswer;
    }

    public int getCorrectMultipleChoiceScore() {

        return multipleChoiceScore;
    }

    public int checkForCorrectMultipleChoiceAnswer(int userAnswer){
        if(userAnswer == correctMultipleChoiceAnswer){
            this.multipleChoiceScore += 1;
        }
        return this.multipleChoiceScore;
    }
}
