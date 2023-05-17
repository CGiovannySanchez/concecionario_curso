package com.project.coches.domain.repository;

import com.project.coches.domain.pojo.MarcaCochePojo;

import java.util.List;
import java.util.Optional;

public interface IMarcaCocheRepository {

    /**
     * Devuelve una lista con todas las marcas de coches
     * @return Lista con marcas de coches
     */
    List<MarcaCochePojo> getAll();

    /**
     * Devuelve una marca de coche dada su id
     * @param id Id de marca coche
     * @return Optional de la marca coche encontrada
     */
    Optional<MarcaCochePojo> getMarcaCoche(Integer id);

    /**
     * Guarda una nueva marca coche
     * @param newMarcaCoche marca coche o guardar
     * @return Marca coche guardada
     */
    MarcaCochePojo save(MarcaCochePojo newMarcaCoche);

    /**
     * Elimina Una marca coche dado si id
     * @param idMarcaCoche Id del marca coche a eliminar
     */
    void delete(Integer idMarcaCoche);
}
