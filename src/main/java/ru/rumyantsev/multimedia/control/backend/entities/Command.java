package ru.rumyantsev.multimedia.control.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Command extends AbstractEntity {
    @OneToOne
    private DeviceType deviceType;
    private String cmd;
    private String cmdComment;
}
