package com.company;

public class TrueFalse extends Question{
    private int trueFalseCorrectAnswer;
    private int trueFalseScore = 0;

    public TrueFalse(String inquiry, int trueFalseCorrectAnswer){
        super(inquiry);
        this.trueFalseCorrectAnswer = trueFalseCorrectAnswer;
    }

    public int isTrueFalseCorrectAnswer() {
        return trueFalseCorrectAnswer;
    }

    public void setTrueFalseCorrectAnswer(int trueFalseCorrectAnswer) {
        this.trueFalseCorrectAnswer = trueFalseCorrectAnswer;
    }

    public int getTrueFalseScore() {
        return trueFalseScore;
    }

    public int checkForCorrectTrueFalseAnswer(int userAnswer){
        if(userAnswer == trueFalseCorrectAnswer ){
            System.out.println("Correct!");
            this.trueFalseScore += 1;
        } else {
            System.out.println("Sorry, that is incorrect.");
        }

        return this.trueFalseScore;
    }

    public void printAnswerOptions(){
        System.out.println("1 - True");
        System.out.println("2 - False");
    }
}
