package ru.rumyantsev.multimedia.control.backend.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.rumyantsev.multimedia.control.backend.dtos.DeviceTypeDto;
import ru.rumyantsev.multimedia.control.backend.repositories.DevicesTypeRepository;

import java.util.List;
import java.util.UUID;

import static ru.rumyantsev.multimedia.control.backend.mappers.DeviceMapper.DEVICE_MAPPER;

@Service
@RequiredArgsConstructor
public class DevicesTypeService {

    private final DevicesTypeRepository devicesTypeRepository;

    public List<DeviceTypeDto> getAll() {
        return DEVICE_MAPPER.toDtoList(devicesTypeRepository.findAll());
    }

    public DeviceTypeDto getById(UUID id) {
        return DEVICE_MAPPER.toDto(devicesTypeRepository.findById(id).orElseThrow());
    }
}
