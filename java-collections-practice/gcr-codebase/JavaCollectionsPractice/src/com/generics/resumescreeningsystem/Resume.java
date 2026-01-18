package com.generics.resumescreeningsystem;

//Resume can belong to only JobRole types
public class Resume<T extends JobRole> {

 private T jobProfile;

 public Resume(T jobProfile) {
     this.jobProfile = jobProfile;
 }

 public T getJobProfile() {
     return jobProfile;
 }
}

