package com.cineverse.catalogservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MovieDto(
        Long id,
        String title,
        String genre,
        String streamingUrl) implements Serializable {
}