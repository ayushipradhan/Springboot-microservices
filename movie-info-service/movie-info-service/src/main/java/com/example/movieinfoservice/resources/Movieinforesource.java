package com.example.movieinfoservice.resources;

import com.example.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class Movieinforesource {
    @RequestMapping("/{movieId}")
        public Movie getMovieinfo (@PathVariable("movieId") String movieId){
            return new Movie(movieId, "Testname");
        }
    }

