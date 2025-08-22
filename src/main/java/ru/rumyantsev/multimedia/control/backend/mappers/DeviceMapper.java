package ru.rumyantsev.multimedia.control.backend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.rumyantsev.multimedia.control.backend.dtos.DeviceDto;
import ru.rumyantsev.multimedia.control.backend.entities.Device;

import java.util.List;

@Mapper
public interface DeviceMapper {
    DeviceMapper DEVICE_MAPPER = Mappers.getMapper(DeviceMapper.class);

    DeviceDto toDto(Device source);

    List<DeviceDto> toDtoList(List<Device> source);
}
