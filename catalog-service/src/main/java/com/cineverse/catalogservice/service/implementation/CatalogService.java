package com.cineverse.catalogservice.service.implementation;

import com.cineverse.catalogservice.dto.CatalogDto;
import com.cineverse.catalogservice.dto.MovieDto;
import com.cineverse.catalogservice.dto.MovieResponseDto;
import com.cineverse.catalogservice.repository.MovieFeignRepository;
import com.cineverse.catalogservice.service.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService implements ICatalogService {
    private final MovieFeignRepository movieFeignRepository;

    @Autowired
    public CatalogService(MovieFeignRepository movieFeignRepository) {
        this.movieFeignRepository = movieFeignRepository;
    }

    @Override
    public MovieDto saveMovie(MovieDto movieDto) {
        return this.movieFeignRepository.save(movieDto);
    }

    @Override
    public CatalogDto findAllMoviesByGenre(String genre) {
        List<MovieResponseDto> movies = this.movieFeignRepository.findAllMoviesByGenre(genre);
        return new CatalogDto(genre, movies, movies.size());
    }
}
