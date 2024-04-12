package com.ayigroup.revision_asientos.services;

import com.ayigroup.revision_asientos.entities.Asiento;

import java.util.List;


public interface AsientoService {
    List<Asiento>mostrarAsientos();
    Asiento agregarAsiento(Asiento asiento);
    Asiento asientoById(Integer id);



}
