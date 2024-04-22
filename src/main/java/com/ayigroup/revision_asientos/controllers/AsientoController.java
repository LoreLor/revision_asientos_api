package com.ayigroup.revision_asientos.controllers;


import com.ayigroup.revision_asientos.entities.dtos.AsientoDTO;
import com.ayigroup.revision_asientos.entities.dtos.ListaAsientosDTO;
import com.ayigroup.revision_asientos.entities.dtos.NuevoAsientoDTO;
import com.ayigroup.revision_asientos.services.AsientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/revisionasientos")
public class AsientoController {

    @Autowired
    private AsientoService asientoService;


    @PostMapping
    public ResponseEntity<NuevoAsientoDTO> agregarAsiento(@RequestBody @Valid NuevoAsientoDTO nuevoAsientoDTO) {
        NuevoAsientoDTO nvoAsiento = asientoService.agregarAsiento(nuevoAsientoDTO);
        return new ResponseEntity<>(nvoAsiento, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ListaAsientosDTO>> listarAsientos(){
        List<ListaAsientosDTO> asientos = asientoService.mostrarAsientos();
        return new ResponseEntity<>(asientos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AsientoDTO> mostrarAsientoPorId(@PathVariable @Valid Integer id) {
        AsientoDTO asiento = asientoService.asientoById(id);
        if(asiento != null) {
            return new ResponseEntity<>(asiento, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/filtros")
    public ResponseEntity<List<AsientoDTO>> filtrarAsientos(@RequestBody AsientoDTO filtro) {
        List<AsientoDTO> asientosFiltrados = asientoService.filtrarAsientos(
                filtro.getId(),
                filtro.getNroDocumento(),
                filtro.getTipoDocumento(),
                filtro.getNroOrdenCompra(),
                filtro.getNroSubledger(),
                filtro.getNegocio(),
                filtro.getPlanta(),
                filtro.getLinea(),
                filtro.getCentroCosto(),
                filtro.getCuentaObjeto(),
                filtro.getCuentaAuxiliar(),
                filtro.getFechaContable(),
                filtro.getImporte(),
                filtro.getEstadoProceso(),
                filtro.getCompania(),
                filtro.getLibro()
        );
        return new ResponseEntity<>(asientosFiltrados, HttpStatus.OK);
    }
}
