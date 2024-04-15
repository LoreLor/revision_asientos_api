package com.ayigroup.revision_asientos.entities.dtos;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ListaAsientosDTO {

    private Integer id;

    @NotNull
    private Integer nroDocumento;

    @NotNull
    @Size(max=50)
    private String tipoDocumento;

    @NotNull
    @Size(max=100)
    private String cuentaObjeto;

    @NotNull
    @Size(max=100)
    private String cuentaAuxiliar;

    @NotNull
    private BigDecimal importe;

    @NotNull
    @Size(max=100)
    private String estadoProceso;
}
