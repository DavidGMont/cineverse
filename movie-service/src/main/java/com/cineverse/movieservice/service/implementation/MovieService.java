package com.cineverse.movieservice.service.implementation;

import com.cineverse.movieservice.dto.MovieDto;
import com.cineverse.movieservice.mapper.MovieMapper;
import com.cineverse.movieservice.repository.MovieRepository;
import com.cineverse.movieservice.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements IMovieService {
    private final MovieRepository movieRepository;
    private final MovieMapper movieMapper;

    @Autowired
    public MovieService(MovieRepository movieRepository, MovieMapper movieMapper) {
        this.movieRepository = movieRepository;
        this.movieMapper = movieMapper;
    }

    @Override
    public MovieDto save(MovieDto movieDto) {
        return this.movieMapper.toDto(this.movieRepository.save(this.movieMapper.toEntity(movieDto)));
    }

    @Override
    public List<MovieDto> findAllByGenre(String genre) {
        return this.movieRepository.findAllByGenreIgnoreCase(genre)
                .stream()
                .map(this.movieMapper::toDto)
                .toList();
    }
}
