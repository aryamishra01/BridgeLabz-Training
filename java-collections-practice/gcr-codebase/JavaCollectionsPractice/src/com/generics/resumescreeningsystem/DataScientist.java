package com.generics.resumescreeningsystem;

public class DataScientist extends JobRole {

    private int mlScore; // out of 100

    public DataScientist(String name, int exp, int mlScore) {
        super(name, exp);
        this.mlScore = mlScore;
    }

    @Override
    public boolean isEligible() {
        return experience >= 1 && mlScore >= 65;
    }

    @Override
    public void displayProfile() {
        System.out.println("Data Scientist -> " + candidateName +
                ", Exp: " + experience +
                ", ML Score: " + mlScore);
    }
}
