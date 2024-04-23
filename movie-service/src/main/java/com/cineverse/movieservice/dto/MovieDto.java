package com.cineverse.movieservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * DTO for {@link com.cineverse.movieservice.model.MovieEntity}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record MovieDto(
        Long id,
        String title,
        String genre,
        String streamingUrl) implements Serializable {
}