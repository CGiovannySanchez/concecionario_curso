package com.project.coches.persistance.repository;

import com.project.coches.domain.dto.MarcaCocheDto;
import com.project.coches.domain.repository.IMarcaCocheRepository;
import com.project.coches.persistance.entity.MarcaCocheEntity;
import com.project.coches.persistance.mapper.IMarcaCocheMapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repositorio de marca coche
 */
@RequiredArgsConstructor //Crea constructor con los atributos final
@Repository
public class MarcaCocheRepository implements IMarcaCocheRepository {

    /**
     * Crud de marca coche
     */

    private final IMarcaCocheCrudRepository iMarcaCocheCrudRepository;

    /**
     * Mapper de marca coche
     */
    private final IMarcaCocheMapper iMarcaCocheMapper;


    /**
     * Devuelve una lista con todas las marcas de coches
     * @return  Lista con marcas de coches
     */
    @Override
    public List<MarcaCocheDto> getAll() {
        return iMarcaCocheMapper.toMarcasCocheDto(iMarcaCocheCrudRepository.findAll());
    }


    /**
     * Devuelve una marca de coche dada su id
     * @param id Id de marca coche
     * @return Optional del marca coche encontrados
     */
    @Override
    public Optional<MarcaCocheDto> getMarcaCoche(Integer id) {
        return iMarcaCocheCrudRepository.findById(id)
                .map(iMarcaCocheMapper::toMarcaCocheDto);

         // .map(marcaCocheEntity -> iMarcaCocheMapper.toMarcaCochePojo(marcaCocheEntity)); LAMBDA
         // .map(iMarcaCocheMapper::toMarcaCochePojo); Metodo por REFERENCIA
    }


    /**
     * Guarda una nueva marca coche
     * @param newMarcaCoche marca coche o guardar
     * @return Marca coche guardada
     */
    @Override
    public MarcaCocheDto save(MarcaCocheDto newMarcaCoche) {
        MarcaCocheEntity marcaCocheEntity = iMarcaCocheMapper.toMarcaCocheEntity(newMarcaCoche);
        return iMarcaCocheMapper.toMarcaCocheDto(iMarcaCocheCrudRepository.save(marcaCocheEntity));
    }


    /**
     * Elimina una marca coche dada su id
     * @param idMarcaCoche Id del marca coche a eliminar
     */
    @Override
    public void delete(Integer idMarcaCoche) {
        iMarcaCocheCrudRepository.deleteById(idMarcaCoche);

    }
}
