package com.ayigroup.revision_asientos.services;

import com.ayigroup.revision_asientos.entities.Asiento;
import com.ayigroup.revision_asientos.entities.dtos.AsientoDTO;
import com.ayigroup.revision_asientos.entities.dtos.ListaAsientosDTO;
import com.ayigroup.revision_asientos.entities.dtos.NuevoAsientoDTO;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public interface AsientoService {
    List<ListaAsientosDTO>mostrarAsientos();
    NuevoAsientoDTO agregarAsiento(NuevoAsientoDTO nuevoAsiento);
    AsientoDTO asientoById(Integer id);
    List<AsientoDTO> filtrarAsientos(Integer id,
                                     Integer nroDocumento,
                                     String tipoDocumento,
                                     Integer nroOrdenCompra,
                                     Integer nroSubledger,
                                     String negocio,
                                     Integer planta,
                                     Integer linea,
                                     Integer centroCosto,
                                     String cuentaObjeto,
                                     String cuentaAuxiliar,
                                     Date fechaContable,
                                     BigDecimal importe,
                                     String estadoProceso,
                                     String compania,
                                     String libro
    );
}
