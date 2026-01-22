package com.collections.insurancepolicymanagementsystem;

import java.time.LocalDate;

public class Policy implements Comparable<Policy> {

    int policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    public Policy(int policyNumber, String holderName, LocalDate expiryDate,
                  String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    // For TreeSet → sort by expiry date
    @Override
    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }

    // Uniqueness based on policy number
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy p = (Policy) o;
        return this.policyNumber == p.policyNumber;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(policyNumber);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + holderName + " | " + coverageType +
               " | Exp: " + expiryDate + " | ₹" + premium;
    }
}

