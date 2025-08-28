package ru.rumyantsev.multimedia.control.backend.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rumyantsev.multimedia.control.backend.dtos.DeviceDto;
import ru.rumyantsev.multimedia.control.backend.services.DevicesService;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/devices")
public class DevicesController {

    private final DevicesService devicesService;

    @GetMapping
    public List<DeviceDto> findAll() {
        return devicesService.getAll();
    }

    @GetMapping(value = "/{id}")
    public DeviceDto findOne(@PathVariable UUID id) {
        return devicesService.getById(id);
    }
}
