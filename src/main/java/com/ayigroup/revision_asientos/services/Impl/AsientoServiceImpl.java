package com.ayigroup.revision_asientos.services.Impl;

import com.ayigroup.revision_asientos.entities.Asiento;
import com.ayigroup.revision_asientos.entities.dtos.AsientoDTO;
import com.ayigroup.revision_asientos.entities.dtos.ListaAsientosDTO;
import com.ayigroup.revision_asientos.entities.dtos.NuevoAsientoDTO;
import com.ayigroup.revision_asientos.repository.AsientoRepository;
import com.ayigroup.revision_asientos.services.AsientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AsientoServiceImpl implements AsientoService {

    @Autowired
    private AsientoRepository asientoRepository;

    @Override
    public List<ListaAsientosDTO> mostrarAsientos() {
        List<Asiento> asientos = asientoRepository.findAll();
        return asientos.stream()
                .map(this::convertirAListaAsientosDTO)
                .collect(Collectors.toList());
    }

    @Override
    public NuevoAsientoDTO agregarAsiento(NuevoAsientoDTO nuevoAsiento) {
        Asiento asiento = convertirANuevoAsientoDTO(nuevoAsiento);
        asientoRepository.save(asiento);
        return nuevoAsiento;
    }

    @Override
    public AsientoDTO asientoById(Integer id) {
        Asiento asiento = asientoRepository.findById(id).orElse(null);
        return convertirAAsientoDTO(asiento);
    }


    // Métodos de conversión

    // Agregar
    private Asiento convertirANuevoAsientoDTO(NuevoAsientoDTO nuevoAsiento) {
        Asiento asiento = new Asiento();
        asiento.setNroDocumento(nuevoAsiento.getNroDocumento());
        asiento.setTipoDocumento(nuevoAsiento.getTipoDocumento());
        asiento.setCompania(nuevoAsiento.getCompania());
        asiento.setUnidadDeNegocio(nuevoAsiento.getUnidadDeNegocio());
        asiento.setCuentaObjeto(nuevoAsiento.getCuentaObjeto());
        asiento.setCuentaAuxiliar(nuevoAsiento.getCuentaAuxiliar());
        asiento.setLieneaAsiento(nuevoAsiento.getLieneaAsiento());
        asiento.setLibro(nuevoAsiento.getLibro());
        asiento.setFechaContable(nuevoAsiento.getFechaContable());
        asiento.setImporte(nuevoAsiento.getImporte());
        asiento.setEstadoProceso(nuevoAsiento.getEstadoProceso());
        return asiento;
    }

    // Detalle
    private AsientoDTO convertirAAsientoDTO(Asiento asiento) {
        AsientoDTO asientoDTO = new AsientoDTO();
        asientoDTO.setId(asiento.getId());
        asientoDTO.setNroDocumento(asiento.getNroDocumento());
        asientoDTO.setTipoDocumento(asiento.getTipoDocumento());
        asientoDTO.setCompania(asiento.getCompania());
        asientoDTO.setUnidadDeNegocio(asiento.getUnidadDeNegocio());
        asientoDTO.setCuentaObjeto(asiento.getCuentaObjeto());
        asientoDTO.setCuentaAuxiliar(asiento.getCuentaAuxiliar());
        asientoDTO.setLieneaAsiento(asiento.getLieneaAsiento());
        asientoDTO.setLibro(asiento.getLibro());
        asientoDTO.setFechaContable(asiento.getFechaContable());
        asientoDTO.setImporte(asiento.getImporte());
        asientoDTO.setEstadoProceso(asiento.getEstadoProceso());
        return asientoDTO;
    }

    // Listado
    private ListaAsientosDTO convertirAListaAsientosDTO(Asiento asiento) {
        ListaAsientosDTO listaAsientosDTO = new ListaAsientosDTO();
        listaAsientosDTO.setId(asiento.getId());
        listaAsientosDTO.setNroDocumento(asiento.getNroDocumento());
        listaAsientosDTO.setTipoDocumento(asiento.getTipoDocumento());
        listaAsientosDTO.setCuentaObjeto(asiento.getCuentaObjeto());
        listaAsientosDTO.setCuentaAuxiliar(asiento.getCuentaAuxiliar());
        listaAsientosDTO.setImporte(asiento.getImporte());
        listaAsientosDTO.setEstadoProceso(asiento.getEstadoProceso());
        return listaAsientosDTO;
    }
}

