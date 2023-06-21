package com.project.coches.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entidad de un cliente
 */
@Getter
@Setter
@Entity
@Table(name = "cliente")
public class CustomerEntity {


    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cedula")
    private String cardId;


    @Column(name = "nombreCompleto")
    private String fullName;

    @Column(name = "correo")
    private String email;

    @Column(name = "numeroCelular")
    private String cellPhoneNumber;

    @Column(name = "activo")
    private Integer active;

    @Column(name = "contrasenia")
    private String password;
}
