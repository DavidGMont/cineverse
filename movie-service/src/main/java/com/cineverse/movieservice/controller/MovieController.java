package com.cineverse.movieservice.controller;

import com.cineverse.movieservice.dto.MovieDto;
import com.cineverse.movieservice.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin
public class MovieController {
    private final IMovieService movieService;

    @Autowired
    public MovieController(IMovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    ResponseEntity<MovieDto> save(MovieDto movieDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.movieService.save(movieDto));
    }

    @GetMapping("/{genre}")
    ResponseEntity<List<MovieDto>> findAllByGenre(@PathVariable String genre) {
        return ResponseEntity.ok(this.movieService.findAllByGenre(genre));
    }
}
