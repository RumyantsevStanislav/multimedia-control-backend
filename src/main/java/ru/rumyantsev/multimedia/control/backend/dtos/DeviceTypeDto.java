package ru.rumyantsev.multimedia.control.backend.dtos;

import java.util.UUID;

public record DeviceTypeDto(UUID id, String name, String port, String connectionTypeName) {
}
