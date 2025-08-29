package ru.rumyantsev.multimedia.control.backend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ru.rumyantsev.multimedia.control.backend.dtos.DeviceTypeDto;
import ru.rumyantsev.multimedia.control.backend.entities.DeviceType;

import java.util.List;

@Mapper
public interface DeviceMapper {
    DeviceMapper DEVICE_MAPPER = Mappers.getMapper(DeviceMapper.class);

    @Mapping(target = "connectionTypeName", source = "connectionType.name")
    DeviceTypeDto toDto(DeviceType source);

    List<DeviceTypeDto> toDtoList(List<DeviceType> source);
}
