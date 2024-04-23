package com.cineverse.catalogservice.dto;

import java.io.Serializable;
import java.util.List;

public record CatalogDto(
        String genre,
        List<MovieResponseDto> movies,
        Integer totalMovies) implements Serializable {
}
