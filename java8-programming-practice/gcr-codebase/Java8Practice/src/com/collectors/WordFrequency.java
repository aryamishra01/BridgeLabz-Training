package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequency {
	
    public static void main(String[] args) {

        String paragraph = "java is powerful and java is popular";

        Map<String, Integer> wordCount =
        		
            Arrays.stream(paragraph.split("\\s+"))
                  .collect(Collectors.toMap(
                      word -> word,
                      word -> 1,
                      Integer::sum   // merge function for duplicate words
                  ));

        System.out.println(wordCount);
    }
}

