package com.company;

import java.util.ArrayList;

public class MultipleChoice extends Question{
    private ArrayList<String> multipleChoiceAnswerOptions;
    private int correctAnswer;
    private int score = 0;

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

    public void printAnswerOptionsForMultipleChoice(ArrayList<String> multipleChoiceAnswerOptions){
        System.out.println("Please choose the number that corresponds to the correct answer");
        for (String answerOption : multipleChoiceAnswerOptions){
            System.out.println(answerOption);
        }
    }

    public int checkForCorrectMultipleChoiceAnswer(int userAnswer){
        if(userAnswer == correctAnswer){
            this.score += 1;
        }
        return score;
    }
}
