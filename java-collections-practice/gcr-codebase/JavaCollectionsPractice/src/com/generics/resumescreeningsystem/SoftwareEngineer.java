package com.generics.resumescreeningsystem;

public class SoftwareEngineer extends JobRole {

    private int codingScore; // out of 100

    public SoftwareEngineer(String name, int exp, int codingScore) {
        super(name, exp);
        this.codingScore = codingScore;
    }

    @Override
    public boolean isEligible() {
        return experience >= 1 && codingScore >= 60;
    }

    @Override
    public void displayProfile() {
        System.out.println("Software Engineer -> " + candidateName +
                ", Exp: " + experience +
                ", Coding Score: " + codingScore);
    }
}

