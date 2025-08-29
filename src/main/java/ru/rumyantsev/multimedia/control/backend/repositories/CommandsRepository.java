package ru.rumyantsev.multimedia.control.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rumyantsev.multimedia.control.backend.entities.Command;

import java.util.List;
import java.util.UUID;

@Repository
public interface CommandsRepository extends JpaRepository<Command, UUID> {
    List<Command> findAllByDeviceType_Id(UUID deviceTypeId);
}
