package ru.rumyantsev.multimedia.control.backend.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.rumyantsev.multimedia.control.backend.dtos.DeviceDto;
import ru.rumyantsev.multimedia.control.backend.repositories.DevicesRepository;

import java.util.List;
import java.util.UUID;

import static ru.rumyantsev.multimedia.control.backend.mappers.DeviceMapper.DEVICE_MAPPER;

@Service
@RequiredArgsConstructor
public class DevicesService {

    private final DevicesRepository devicesRepository;

    public List<DeviceDto> getAll() {
        return DEVICE_MAPPER.toDtoList(devicesRepository.findAll());
    }

    public DeviceDto getById(UUID id) {
        return DEVICE_MAPPER.toDto(devicesRepository.findById(id).orElseThrow());
    }
}
