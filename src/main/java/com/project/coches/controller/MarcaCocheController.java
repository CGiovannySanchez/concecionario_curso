package com.project.coches.controller;

import com.project.coches.domain.dto.MarcaCocheDto;
import com.project.coches.domain.service.IMarcaCocheService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



/**
 * Controllador de marca coche
 */
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/marcas-coches")
public class MarcaCocheController {

    /**
     * Servicio de Marca coche
     */
    private final IMarcaCocheService iMarcaCocheService;

    /**
     * Devuelve lista de marcas coche
     * @return Httpcode ok con lista de marcas coche
     */
    @GetMapping()
    public ResponseEntity<List<MarcaCocheDto>> getAll(){
        return ResponseEntity.ok(iMarcaCocheService.getAll());
       // return ResponseEntity.status(HttpStatus.OK)
       //         .body(iMarcaCocheService.getAll()); Alternativa para crear ResponseEntity
       // return new ResponseEntity<>(iMarcaCocheService.getAll(), HttpStatus.OK); Alternativa para crear ResponseEntity
    }

    /**
     * Devuelve una marca coche dado su id
     * @param id Id de la marca coche a buscar
     * @return HttpCode ok si la encuentra, HttpCode Not Found de lo si no la encuentra
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity<MarcaCocheDto> getMarcaCoche(@PathVariable Integer id){
        return ResponseEntity.of(iMarcaCocheService.getMarcaCoche(id));
    }

    /**
     * Crea una nueva marca coche
     * @param marcaCocheDtoNew Marca coche a crear
     * @return HttpCode Created si la guarda correctamente, HttpCode Bad Request de lo contrario
     */
    @PostMapping
    public ResponseEntity<MarcaCocheDto> save(@RequestBody MarcaCocheDto marcaCocheDtoNew){
        try{
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(iMarcaCocheService.save(marcaCocheDtoNew));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    /***
     * Actualiza una marca coche
     * @param marcaCocheDtoUpdate Marca coche Actualiada
     * @return HttpCode ok si la actualiza correctamente
     */
    @PatchMapping
    public ResponseEntity<MarcaCocheDto> update(@RequestBody MarcaCocheDto marcaCocheDtoUpdate){
        return ResponseEntity.of(iMarcaCocheService.update(marcaCocheDtoUpdate));
    }

    /**
     * Elimina una marca coche dado su Id
     * @param id Id de la marca coche a eliminar
     * @return HttpCode ok si la elimina, HttpCode Not Found si no exite
     */
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id){
        return new ResponseEntity<>(this.iMarcaCocheService.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);

    }


}
