package ru.rumyantsev.multimedia.control.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import ru.rumyantsev.multimedia.control.backend.dtos.CommandDto;
import ru.rumyantsev.multimedia.control.backend.services.CommandsService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/commands")
public class CommandsController {

    private final CommandsService commandsService;

    @GetMapping
    public List<CommandDto> findByBrand (
            @RequestParam(required = false) String brand
    ) {
        return commandsService.getAllByBrand(brand);
    }
}
