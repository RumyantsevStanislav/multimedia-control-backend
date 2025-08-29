package ru.rumyantsev.multimedia.control.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class DeviceType extends AbstractEntity {

    private String name;
    private String port;
    @ManyToOne
    private ConnectionType connectionType;
    @OneToMany
    private List<Command> commands;
}

