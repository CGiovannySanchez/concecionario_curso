package com.project.coches.domain.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Pojo de marca coche
 */
@Getter
@Setter
public class MarcaCocheDto {

    /**
     * Id de la marca
     */
    private Integer id;

    /**
     * descripcion de la marca
     */
    private String description;
}
