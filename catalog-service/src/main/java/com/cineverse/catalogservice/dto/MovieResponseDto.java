package com.cineverse.catalogservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MovieResponseDto(
        Long id,
        String title,
        String streamingUrl) implements Serializable {
}