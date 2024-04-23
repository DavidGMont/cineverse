package com.cineverse.catalogservice.controller;

import com.cineverse.catalogservice.dto.CatalogDto;
import com.cineverse.catalogservice.dto.MovieDto;
import com.cineverse.catalogservice.service.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/catalog")
@CrossOrigin
public class CatalogController {
    private final ICatalogService catalogService;

    @Autowired
    public CatalogController(ICatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @PostMapping
    MovieDto saveMovie(@RequestBody MovieDto movieDto) {
        return this.catalogService.saveMovie(movieDto);
    }

    @GetMapping("/{genre}")
    CatalogDto findAllMoviesByGenre(@PathVariable String genre) {
        return this.catalogService.findAllMoviesByGenre(genre);
    }
}
