package com.project.coches.persistance.mapper;

import com.project.coches.domain.dto.MarcaCocheDto;
import com.project.coches.persistance.entity.MarcaCocheEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper que transforma objetos de marca Coche a Dtos o entidades
 */
@Mapper(componentModel = "spring")
public interface IMarcaCocheMapper {

    /**
     * Convierte una entidad a un pojo de marca coche
     * @param marcaEntity Entidad a convertir
     * @return Dto convertido
     */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    MarcaCocheDto toMarcaCocheDto(MarcaCocheEntity marcaEntity);


    /**
     * Convierte un Dto a una entidad de marca coche
     * @param marcaPojo  a convertir
     * @return Entity convertido
     */
    @InheritInverseConfiguration
    MarcaCocheEntity toMarcaCocheEntity(MarcaCocheDto marcaDto);

    /**
     * Retorna una lista de marcas coche transformada a pojo de uam lista de entidades
     * @param marcasCocheEntity Entidad a trasnsformar
     * @return Lista transformada
     */
    List<MarcaCocheDto> toMarcasCocheDto(List<MarcaCocheEntity> marcasCocheEntity);
}
