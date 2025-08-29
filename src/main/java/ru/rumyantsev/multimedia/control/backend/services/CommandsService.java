package ru.rumyantsev.multimedia.control.backend.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.rumyantsev.multimedia.control.backend.dtos.CommandDto;
import ru.rumyantsev.multimedia.control.backend.repositories.CommandsRepository;

import java.util.List;
import java.util.UUID;

import static ru.rumyantsev.multimedia.control.backend.mappers.CommandMapper.DEVICE_COMMAND_MAPPER;

@Service
@RequiredArgsConstructor
public class CommandsService {

    private final CommandsRepository commandsRepository;

    public List<CommandDto> getAll() {
        return DEVICE_COMMAND_MAPPER.toDtoList(commandsRepository.findAll());
    }

    public List<CommandDto> getAllByDeviceTypeId(UUID id) {
        return DEVICE_COMMAND_MAPPER.toDtoList(commandsRepository.findAllByDeviceType_Id(id));
    }
}
