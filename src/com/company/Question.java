package com.company;

import java.util.ArrayList;

public class Question {
    private String inquiry;

    public Question(String inquiry) {
        this.inquiry = inquiry;
    }

    public void printQuestion() {

        System.out.println(inquiry);
    }

    public void printAnswerOptions(ArrayList<String> answerOptions){
        System.out.println("Please choose the number that corresponds to the correct answer!");
        for (String answerOption : answerOptions){
            System.out.println(answerOption);
        }
    }


}
