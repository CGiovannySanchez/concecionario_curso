package com.project.coches.domain.service;

import com.project.coches.domain.dto.CustomerDto;
import com.project.coches.domain.dto.MarcaCocheDto;
import com.project.coches.domain.dto.ResponseCustomerDto;

import java.util.List;
import java.util.Optional;

/**
 * Interface de servicio de Cliente
 */
public interface ICustomerService {

    /**
     * Devuelve una lista con todos los clientes
     * @return Lista de clientes
     */

    List<CustomerDto> getAll();

    Optional<CustomerDto> getCustomerByCardId(String cardId);

    Optional<CustomerDto> getCustomerByEmail(String Email);

    ResponseCustomerDto save(CustomerDto newCustomer);

    Optional <CustomerDto> update(CustomerDto modifyCustomer);

    boolean delete(String cardId);


}
