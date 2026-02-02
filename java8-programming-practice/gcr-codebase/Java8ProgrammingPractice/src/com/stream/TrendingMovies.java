package com.stream;

import java.util.*;
import java.util.stream.*;



public class TrendingMovies {
	
	public static class Movie {
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
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.9, 2024),
            new Movie("Movie B", 9.1, 2023),
            new Movie("Movie C", 8.5, 2022),
            new Movie("Movie D", 9.1, 2024),
            new Movie("Movie E", 8.8, 2023),
            new Movie("Movie F", 9.0, 2024),
            new Movie("Movie G", 7.9, 2021)
        );

        List<Movie> top5Trending = movies.stream()
            .filter(m -> m.rating >= 8.0)   // optional filter
            .sorted(
                Comparator.comparingDouble((Movie m) -> m.rating).reversed()
                          .thenComparingInt(m -> m.releaseYear).reversed()
            )
            .limit(5)
            .collect(Collectors.toList());

        top5Trending.forEach(System.out::println);
    }
}
