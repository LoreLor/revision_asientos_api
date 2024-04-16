package com.ayigroup.revision_asientos.services;

import com.ayigroup.revision_asientos.entities.Asiento;
import com.ayigroup.revision_asientos.entities.dtos.AsientoDTO;
import com.ayigroup.revision_asientos.entities.dtos.ListaAsientosDTO;
import com.ayigroup.revision_asientos.entities.dtos.NuevoAsientoDTO;

import java.util.Date;
import java.util.List;


public interface AsientoService {
    List<ListaAsientosDTO>mostrarAsientos();
    NuevoAsientoDTO agregarAsiento(NuevoAsientoDTO nuevoAsiento);
    AsientoDTO asientoById(Integer id);
    List<AsientoDTO> filtrarAsientos(Integer nroDocumento,
                                     String tipoDocumento,
                                     String compania,
                                     String unidadDeNegocio,
                                     String cuentaObjeto,
                                     String cuentaAuxiliar,
                                     String libro,
                                     Integer lieneaAsiento,
                                     Date fechaContable,
                                     String estadoProceso
    );
}
