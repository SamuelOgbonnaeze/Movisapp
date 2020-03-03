package com.elvis.movieapp.repositories;

import com.elvis.movieapp.models.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, String> {
}
