package com.example.cinematicketbooking.repositories;

import com.example.cinematicketbooking.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
