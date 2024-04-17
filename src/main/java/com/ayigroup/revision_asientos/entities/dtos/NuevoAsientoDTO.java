package com.ayigroup.revision_asientos.entities.dtos;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NuevoAsientoDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private Integer nroDocumento;

    @NotNull
    @Size(max=50)
    private String tipoDocumento;

    @NotNull
    private Integer nroOrdenCompra;

    @NotNull
    private Integer nroSubledger;

    @NotNull
    @Size(max=2)
    private String negocio;

    @NotNull
    @Size(max=2)
    private Integer planta;

    @NotNull
    @Size(max=4)
    private Integer centroCosto;

    @NotNull
    @Size(max=4)
    private Integer linea;

    @NotNull
    @Size(max=100)
    private String cuentaObjeto;

    @NotNull
    @Size(max=100)
    private String cuentaAuxiliar;

    @NotNull
    private Date fechaContable;

    @NotNull
    private BigDecimal importe;

    @NotNull
    @Size(max=100)
    private String estadoProceso;

    @NotNull
    @Size(max=100)
    private String compania;

    @NotNull
    @Size(max=50)
    private String libro;

}
