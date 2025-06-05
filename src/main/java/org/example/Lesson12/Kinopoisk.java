package org.example.Lesson12;

import java.util.ArrayList;
import java.util.List;

public class Kinopoisk {

    public static void main(String[] args) {
        // MovieR movie1R = new MovieR("Интерстеллар", "Научная фантастика");
      //  movie1R.justMethod();
       // System.out.println(movie1R.genre());


        Movie movie1 = new Movie("Интерстеллар", Genre.SCI_FI);
        Movie movie2 = new Movie("Довод", Genre.ACTION);
        Movie movie3 = new Movie("Звездные Воины", Genre.FANTASY);
        Movie movie4 = new Movie("Индиана Джонс", Genre.ACTION);



//        int countActionFilms = 0;
//        List<Movie> movies = List.of(movie1,movie2,movie3,movie4);
//        for (Movie movie : movies) {
//            if (movie.getGenre().equals(Genres.ACTION)) {
//                countActionFilms++;
//            }
//        }
//        System.out.println(countActionFilms);
    }
}
