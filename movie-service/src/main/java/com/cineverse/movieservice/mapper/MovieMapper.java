package com.cineverse.movieservice.mapper;

import com.cineverse.movieservice.dto.MovieDto;
import com.cineverse.movieservice.model.MovieEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface MovieMapper {
    MovieEntity toEntity(MovieDto movieDto);

    MovieDto toDto(MovieEntity movieEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    MovieEntity partialUpdate(MovieDto movieDto, @MappingTarget MovieEntity movieEntity);
}