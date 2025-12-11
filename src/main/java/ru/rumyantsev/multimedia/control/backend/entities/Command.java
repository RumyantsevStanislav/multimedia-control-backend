package ru.rumyantsev.multimedia.control.backend.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Command extends AbstractEntity {

    private String brand;
    private String cmd;
    private String name;
}
