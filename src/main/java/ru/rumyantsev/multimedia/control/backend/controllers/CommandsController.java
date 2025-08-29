package ru.rumyantsev.multimedia.control.backend.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rumyantsev.multimedia.control.backend.dtos.CommandDto;
import ru.rumyantsev.multimedia.control.backend.services.CommandsService;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/commands")
public class CommandsController {

    private final CommandsService commandsService;

    @GetMapping(value = "/device/{id}")
    public List<CommandDto> findByDeviceId(@PathVariable UUID id) {
        return commandsService.getAllByDeviceTypeId(id);
    }
}
