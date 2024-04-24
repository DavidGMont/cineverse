package com.cineverse.catalogservice.repository;

import com.cineverse.catalogservice.dto.MovieDto;
import com.cineverse.catalogservice.dto.MovieResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "movie-service", path = "/api/v1/movies")
public interface MovieFeignRepository {
    @PostMapping(consumes = "application/json")
    MovieDto save(@RequestBody MovieDto movieDto);

    @GetMapping(value = "/{genre}")
    List<MovieResponseDto> findAllMoviesByGenre(@PathVariable String genre);
}
