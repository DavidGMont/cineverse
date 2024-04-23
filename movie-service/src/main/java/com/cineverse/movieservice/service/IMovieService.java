package com.cineverse.movieservice.service;

import com.cineverse.movieservice.dto.MovieDto;

import java.util.List;

public interface IMovieService {
    MovieDto save(MovieDto movieDto);

    List<MovieDto> findAllByGenre(String genre);
}
