package com.project.coches.domain.service;

import com.project.coches.domain.dto.MarcaCocheDto;

import java.util.List;
import java.util.Optional;

public interface IMarcaCocheService {

    /**
     * Devuelve una lista con todas las marcas de coches
     * @return Lista con marcas de coches
     */
    List<MarcaCocheDto> getAll();

    /**
     * Devuelve una marca de coche dada su id
     * @param id Id de marca coche
     * @return Optional de la marca coche encontrada
     */
    Optional<MarcaCocheDto> getMarcaCoche(Integer id);

    /**
     * Guarda una nueva marca coche
     * @param newMarcaCoche marca coche o guardar
     * @return Marca coche guardada
     */
    MarcaCocheDto save(MarcaCocheDto newMarcaCoche);

    /**
     * Actializa una marca coche
     * @param newMarcaCoche Marca coche Actualizar
     * @return Marca coche Actualizado
     */
    Optional <MarcaCocheDto> update(MarcaCocheDto newMarcaCoche);

    /**
     * Elimina Una marca coche dado si id
     * @param idMarcaCoche Id del marca coche a eliminar
     */
    boolean delete(Integer idMarcaCoche);
}
