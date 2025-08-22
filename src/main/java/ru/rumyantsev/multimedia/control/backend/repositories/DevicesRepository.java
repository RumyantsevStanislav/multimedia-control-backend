package ru.rumyantsev.multimedia.control.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rumyantsev.multimedia.control.backend.entities.Device;

import java.util.UUID;

@Repository
public interface DevicesRepository extends JpaRepository<Device, UUID> {
}
