package com.generics.resumescreeningsystem;

//Base class for all job roles
public abstract class JobRole {

 protected String candidateName;
 protected int experience; // in years

 public JobRole(String candidateName, int experience) {
     this.candidateName = candidateName;
     this.experience = experience;
 }

 // Each role has its own screening criteria
 public abstract boolean isEligible();

 public abstract void displayProfile();
}

