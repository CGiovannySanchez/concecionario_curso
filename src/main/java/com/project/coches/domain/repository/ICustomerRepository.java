package com.project.coches.domain.repository;

import com.project.coches.domain.dto.CustomerDto;

import java.util.List;
import java.util.Optional;

/**
 * Interface del repósitorio Cliente
 */
public interface ICustomerRepository {

    /**
     * Devuelve una lista con todas los Clientes
     * @return Lista con los Clientes
     */
    List<CustomerDto> getAll();

    /**
     * Devuelve Cliente dado su id
     * @param id Id de marca coche
     * @return Optional de la marca coche encontrada
     */
    Optional<CustomerDto> getCustomerByCardId(String cardId);

    /**
     * Devuelve Cliente dado su id
     * @param id Id de marca coche
     * @return Optional de la marca coche encontrada
     */
    Optional<CustomerDto> getCustomerByEmail(String email);

    /**
     * Guarda una nueva marca coche
     * @param newMarcaCoche marca coche o guardar
     * @return Marca coche guardada
     */
    CustomerDto save(CustomerDto newCustomer);

    /**
     * Elimina Una marca coche dado si id
     * @param idMarcaCoche Id del marca coche a eliminar
     */
    void delete(String cardId);
}
