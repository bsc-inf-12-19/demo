package com.example.demo.tourism;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TourismRepository
        extends JpaRepository<Tourism, Long>
{

    @Query("SELECT s FROM Tourism s WHERE s.email = ?1")
    Optional<Tourism>findTourismByEmail(String email);
}
