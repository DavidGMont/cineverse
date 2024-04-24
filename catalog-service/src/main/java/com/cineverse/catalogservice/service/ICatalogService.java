package com.cineverse.catalogservice.service;

import com.cineverse.catalogservice.dto.CatalogDto;
import com.cineverse.catalogservice.dto.MovieDto;

public interface ICatalogService {
    MovieDto saveMovie(MovieDto movieDto);

    CatalogDto findAllMoviesByGenre(String genre);
}
