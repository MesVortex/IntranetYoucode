package com.example.IntranetYoucode.Repositories;

import com.example.IntranetYoucode.Entities.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
    Optional<Classroom> findByName(String name);
}
