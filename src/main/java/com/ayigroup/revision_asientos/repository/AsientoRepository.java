package com.ayigroup.revision_asientos.repository;

import com.ayigroup.revision_asientos.entities.Asiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Repository
public interface AsientoRepository extends JpaRepository<Asiento, Integer> {

    // establezco criterio de consulta
    @Query("SELECT a FROM Asiento a WHERE " +
            "a.id = :id OR " +
            "a.nroDocumento = :nroDocumento OR " +
            "a.tipoDocumento = :tipoDocumento OR " +
            "a.nroOrdenCompra = :nroOrdenCompra OR " +
            "a.nroSubledger = :nroSubledger OR " +
            "a.negocio = :negocio OR " +
            "a.planta = :planta OR " +
            "a.centroCosto = :centroCosto OR " +
            "a.linea = :linea OR " +
            "a.cuentaObjeto = :cuentaObjeto OR " +
            "a.cuentaAuxiliar = :cuentaAuxiliar OR " +
            "a.fechaContable = :fechaContable OR " +
            "a.importe = :importe OR " +
            "a.estadoProceso = :estadoProceso OR " +
            "a.libro = :libro OR " +
            "a.compania = :compania "
            )
    List<Asiento> findByIdAndNroDocumentoAndTipoDocumentoAndNroOrdenCompraAndNroSubledgerAndNegocioAndPlantaAndCentroCostoAndLineaAndCuentaObjetoAndCuentaAuxiliarAndFechaContableAndImporteAndEstadoProcesoAndLibroAndCompania(
            Integer id,
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
            String libro);


}
