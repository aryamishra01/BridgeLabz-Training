package com.generics.resumescreeningsystem;

public class ProductManager extends JobRole {

    private int communicationScore; // out of 100

    public ProductManager(String name, int exp, int commScore) {
        super(name, exp);
        this.communicationScore = commScore;
    }

    @Override
    public boolean isEligible() {
        return experience >= 2 && communicationScore >= 70;
    }

    @Override
    public void displayProfile() {
        System.out.println("Product Manager -> " + candidateName +
                ", Exp: " + experience +
                ", Communication: " + communicationScore);
    }
}

