package com.streamsapi;

import java.util.*;

public class NameTransform {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("arya", "neha", "amit", "rahul");

        names.stream()
        	 .map(name -> name.toUpperCase())
        	 .sorted()
        	 .forEach(System.out::println);
    }
}

