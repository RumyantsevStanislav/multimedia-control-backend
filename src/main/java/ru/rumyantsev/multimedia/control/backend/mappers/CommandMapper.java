package ru.rumyantsev.multimedia.control.backend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.rumyantsev.multimedia.control.backend.dtos.CommandDto;
import ru.rumyantsev.multimedia.control.backend.entities.Command;

import java.util.List;

@Mapper
public interface CommandMapper {
    CommandMapper DEVICE_COMMAND_MAPPER = Mappers.getMapper(CommandMapper.class);

    CommandDto toDto(Command source);

    List<CommandDto> toDtoList(List<Command> source);
}
