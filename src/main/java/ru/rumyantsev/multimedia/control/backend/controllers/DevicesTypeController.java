package ru.rumyantsev.multimedia.control.backend.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rumyantsev.multimedia.control.backend.dtos.DeviceTypeDto;
import ru.rumyantsev.multimedia.control.backend.services.DevicesTypeService;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/devices")
public class DevicesTypeController {

    private final DevicesTypeService devicesTypeService;

    @GetMapping
    public List<DeviceTypeDto> findAll() {
        return devicesTypeService.getAll();
    }

    @GetMapping(value = "/{id}")
    public DeviceTypeDto findOne(@PathVariable UUID id) {
        return devicesTypeService.getById(id);
    }
}
