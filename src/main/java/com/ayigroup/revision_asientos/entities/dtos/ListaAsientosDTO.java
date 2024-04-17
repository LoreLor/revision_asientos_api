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
public class ListaAsientosDTO {

    private Integer id;
    private Integer nroDocumento;
    private String tipoDocumento;
    private Integer nroOrdenCompra;
    private Integer nroSubledger;
    private String negocio;
    private Integer planta;
    private Integer centroCosto;
    private Integer linea;
    private String cuentaObjeto;
    private String cuentaAuxiliar;
    private Date fechaContable;
    private BigDecimal importe;
    private String estadoProceso;
    private String compania;
    private String libro;
}
