package com.day10.birdsantuary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DeveloperInfo {
    String name();
    String version();
}

