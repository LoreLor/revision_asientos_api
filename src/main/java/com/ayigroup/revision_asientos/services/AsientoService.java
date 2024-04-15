package com.ayigroup.revision_asientos.services;

import com.ayigroup.revision_asientos.entities.Asiento;
import com.ayigroup.revision_asientos.entities.dtos.AsientoDTO;
import com.ayigroup.revision_asientos.entities.dtos.ListaAsientosDTO;
import com.ayigroup.revision_asientos.entities.dtos.NuevoAsientoDTO;

import java.util.List;


public interface AsientoService {
    List<ListaAsientosDTO>mostrarAsientos();
    NuevoAsientoDTO agregarAsiento(NuevoAsientoDTO nuevoAsiento);
    AsientoDTO asientoById(Integer id);
}
