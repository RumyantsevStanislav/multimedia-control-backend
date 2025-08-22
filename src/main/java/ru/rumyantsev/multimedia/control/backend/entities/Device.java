package ru.rumyantsev.multimedia.control.backend.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Device extends AbstractEntity {

    private String name;
}

