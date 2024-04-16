package com.ayigroup.revision_asientos.repository;

import com.ayigroup.revision_asientos.entities.Asiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public interface AsientoRepository extends JpaRepository<Asiento, Integer> {

    // establezco criterio de consulta
    @Query("SELECT a FROM Asiento a WHERE " +
            "a.nroDocumento = :nroDocumento OR " +
            "a.tipoDocumento = :tipoDocumento OR " +
            "a.compania = :compania OR " +
            "a.unidadDeNegocio = :unidadDeNegocio OR " +
            "a.cuentaObjeto = :cuentaObjeto OR " +
            "a.cuentaAuxiliar = :cuentaAuxiliar OR " +
            "a.libro = :libro OR " +
            "a.lineaAsiento = :lineaAsiento OR " +
            "a.fechaContable = :fechaContable OR " +
            "a.estadoProceso = :estadoProceso")
    List<Asiento> findByNroDocumentoAndTipoDocumentoAndCompaniaAndUnidadDeNegocioAndCuentaObjetoAndCuentaAuxiliarAndLibroAndLineaAsientoAndFechaContableAndEstadoProceso(
            Integer nroDocumento, String tipoDocumento, String compania, String unidadDeNegocio,
            String cuentaObjeto, String cuentaAuxiliar, String libro, Integer lineaAsiento,
            Date fechaContable, String estadoProceso);


}
