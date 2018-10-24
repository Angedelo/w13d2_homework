package com.codeclan.example.FilingSystem.repositories;

import com.codeclan.example.FilingSystem.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
