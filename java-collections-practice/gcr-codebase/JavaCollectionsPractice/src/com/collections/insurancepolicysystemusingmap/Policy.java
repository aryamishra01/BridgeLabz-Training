package com.collections.insurancepolicysystemusingmap;

import java.time.LocalDate;

public class Policy {

    int policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    public Policy(int policyNumber, String holderName,
                  LocalDate expiryDate, String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + holderName + " | " + coverageType +
                " | Exp: " + expiryDate + " | ₹" + premium;
    }
}
