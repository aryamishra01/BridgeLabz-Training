package com.streamsapi;
import java.util.*;

class Movie {
    String name;
    double rating;
    int releaseYear;

    Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }
    
    @Override
    public String toString() {
        return name + " | Rating: " + rating + " | Year: " + releaseYear;
    }
}

public class TopMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.5, 2023),
            new Movie("Movie B", 9.0, 2024),
            new Movie("Movie C", 9.0, 2022),
            new Movie("Movie D", 8.8, 2021),
            new Movie("Movie E", 9.2, 2023),
            new Movie("Movie F", 7.9, 2024)
        );
        
        movies.stream()
        	  .filter(m -> m.rating >= 8.0)
        	  .sorted((m1,m2) -> {
        		  if(Double.compare(m2.rating, m1.rating) == 0) {
        			  return Integer.compare(m2.releaseYear, m1.releaseYear);
        		  }
        		  return Double.compare(m2.rating, m1.rating);
        	  })
        	  .limit(5)
        	  .forEach(System.out::println);
        	  
        
    }
}

