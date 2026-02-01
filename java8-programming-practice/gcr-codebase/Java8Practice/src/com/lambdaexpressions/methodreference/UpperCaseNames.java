package com.lambdaexpressions.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseNames {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("arya", "bhumika", "disha", "rashi", "yukta");

        List<String> upperNames =names.stream().map(String::toUpperCase).collect(Collectors.toList());

        upperNames.forEach(System.out::println);
    }
}

