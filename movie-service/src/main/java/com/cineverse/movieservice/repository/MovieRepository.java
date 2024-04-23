package com.cineverse.movieservice.repository;

import com.cineverse.movieservice.model.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
    List<MovieEntity> findAllByGenreIgnoreCase(String genre);
}