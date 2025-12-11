package ru.rumyantsev.multimedia.control.backend.dtos;

import java.util.UUID;

public record CommandDto(UUID id, String cmd, String brand, String name) {
}
