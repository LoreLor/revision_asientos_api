package com.ayigroup.revision_asientos.services.Impl;

import com.ayigroup.revision_asientos.entities.Asiento;
import com.ayigroup.revision_asientos.entities.dtos.AsientoDTO;
import com.ayigroup.revision_asientos.entities.dtos.ListaAsientosDTO;
import com.ayigroup.revision_asientos.entities.dtos.NuevoAsientoDTO;
import com.ayigroup.revision_asientos.repository.AsientoRepository;
import com.ayigroup.revision_asientos.services.AsientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
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

    @Override
    public List<AsientoDTO> filtrarAsientos(Integer id,
                                            Integer nroDocumento,
                                            String tipoDocumento,
                                            Integer nroOrdenCompra,
                                            Integer nroSubledger,
                                            String negocio,
                                            Integer planta,
                                            Integer centroCosto,
                                            Integer linea,
                                            String cuentaObjeto,
                                            String cuentaAuxiliar,
                                            Date fechaContable,
                                            BigDecimal importe,
                                            String estadoProceso,
                                            String compania,
                                            String libro){

        List<Asiento> asientosFiltrados = asientoRepository.findByIdAndNroDocumentoAndTipoDocumentoAndNroOrdenCompraAndNroSubledgerAndNegocioAndPlantaAndCentroCostoAndLineaAndCuentaObjetoAndCuentaAuxiliarAndFechaContableAndImporteAndEstadoProcesoAndLibroAndCompania(
                id,
                nroDocumento,
                tipoDocumento,
                nroOrdenCompra,
                nroSubledger,
                negocio,
                planta,
                centroCosto,
                linea,
                cuentaObjeto,
                cuentaAuxiliar,
                fechaContable,
                importe,
                estadoProceso,
                compania,
                libro);

        return asientosFiltrados.stream()
                .map(this::convertirAAsientoDTO)
                .collect(Collectors.toList());
    }



    // Métodos de conversión

    // Agregar
    private Asiento convertirANuevoAsientoDTO(NuevoAsientoDTO nuevoAsiento) {
        Asiento asiento = new Asiento();

        asiento.setId(nuevoAsiento.getId());
        asiento.setNroDocumento(nuevoAsiento.getNroDocumento());
        asiento.setNroOrdenCompra(nuevoAsiento.getNroOrdenCompra());
        asiento.setTipoDocumento(nuevoAsiento.getTipoDocumento());
        asiento.setNroSubledger(nuevoAsiento.getNroSubledger());
        asiento.setNegocio(nuevoAsiento.getNegocio());
        asiento.setPlanta(nuevoAsiento.getPlanta());
        asiento.setCentroCosto(nuevoAsiento.getCentroCosto());
        asiento.setLinea(nuevoAsiento.getLinea());
        asiento.setCuentaObjeto(nuevoAsiento.getCuentaObjeto());
        asiento.setCuentaAuxiliar(nuevoAsiento.getCuentaAuxiliar());
        asiento.setFechaContable(nuevoAsiento.getFechaContable());
        asiento.setImporte(nuevoAsiento.getImporte());
        asiento.setEstadoProceso(nuevoAsiento.getEstadoProceso());
        asiento.setCompania(nuevoAsiento.getCompania());
        asiento.setLibro(nuevoAsiento.getLibro());
        return asiento;
    }

    // Detalle - Filtro
    private AsientoDTO convertirAAsientoDTO(Asiento asiento) {
        AsientoDTO asientoDTO = new AsientoDTO();

        asientoDTO.setId(asiento.getId());
        asientoDTO.setNroDocumento(asiento.getNroDocumento());
        asientoDTO.setNroOrdenCompra(asiento.getNroOrdenCompra());
        asientoDTO.setTipoDocumento(asiento.getTipoDocumento());
        asientoDTO.setNroSubledger(asiento.getNroSubledger());
        asientoDTO.setNegocio(asiento.getNegocio());
        asientoDTO.setPlanta(asiento.getPlanta());
        asientoDTO.setCentroCosto(asiento.getCentroCosto());
        asientoDTO.setLinea(asiento.getLinea());
        asientoDTO.setCuentaObjeto(asiento.getCuentaObjeto());
        asientoDTO.setCuentaAuxiliar(asiento.getCuentaAuxiliar());
        asientoDTO.setFechaContable(asiento.getFechaContable());
        asientoDTO.setImporte(asiento.getImporte());
        asientoDTO.setEstadoProceso(asiento.getEstadoProceso());
        asientoDTO.setCompania(asiento.getCompania());
        asientoDTO.setLibro(asiento.getLibro());
        return asientoDTO;
    }

    // Listado
    private ListaAsientosDTO convertirAListaAsientosDTO(Asiento asiento) {
        ListaAsientosDTO listaAsientosDTO = new ListaAsientosDTO();

        listaAsientosDTO.setId(asiento.getId());
        listaAsientosDTO.setNroDocumento(asiento.getNroDocumento());
        listaAsientosDTO.setTipoDocumento(asiento.getTipoDocumento());
        listaAsientosDTO.setNroOrdenCompra(asiento.getNroOrdenCompra());
        listaAsientosDTO.setNroSubledger(asiento.getNroSubledger());
        listaAsientosDTO.setNegocio(asiento.getNegocio());
        listaAsientosDTO.setPlanta(asiento.getPlanta());
        listaAsientosDTO.setCentroCosto(asiento.getCentroCosto());
        listaAsientosDTO.setLinea(asiento.getLinea());
        listaAsientosDTO.setCuentaObjeto(asiento.getCuentaObjeto());
        listaAsientosDTO.setCuentaAuxiliar(asiento.getCuentaAuxiliar());
        listaAsientosDTO.setFechaContable(asiento.getFechaContable());
        listaAsientosDTO.setImporte(asiento.getImporte());
        listaAsientosDTO.setEstadoProceso(asiento.getEstadoProceso());
        listaAsientosDTO.setCompania(asiento.getCompania());
        listaAsientosDTO.setLibro(asiento.getLibro());
        return listaAsientosDTO;
    }
}

