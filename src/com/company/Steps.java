package com.company;

public class Steps {
    public static void main(String[] args) {
        walk(3,1);
    }
    public static void walk(int countSteps, int currentStep) {
        if (currentStep <= countSteps) {
            System.out.println("Step forward: " + currentStep);
            walk(countSteps,currentStep +1);
            if(currentStep < countSteps) {
                System.out.println("step backward:" + " " + (currentStep));
            }
        }


//        if (currentStep>=countSteps){
//            countSteps = countSteps-1;
//            System.out.println("Step backward: " + currentStep);
//            walk(countSteps,currentStep -1);
//
//        }

    }
}
