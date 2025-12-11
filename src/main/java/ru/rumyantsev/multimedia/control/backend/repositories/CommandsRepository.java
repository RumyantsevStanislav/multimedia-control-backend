package ru.rumyantsev.multimedia.control.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ru.rumyantsev.multimedia.control.backend.entities.Command;

import java.util.List;
import java.util.UUID;

@Repository
public interface CommandsRepository extends JpaRepository<Command, UUID> {
    @Query("""
            select c
            from Command c
            where (:brand is null or c.brand = :brand)
            """)
    List<Command> findAllByBrand (String brand);
}
