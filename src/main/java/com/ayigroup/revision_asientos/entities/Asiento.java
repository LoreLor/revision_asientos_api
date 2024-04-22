package com.ayigroup.revision_asientos.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(name="asientos")
public class Asiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private Integer nroDocumento;

    @Size(max=50)
    private String tipoDocumento;

    @NotNull
    private Integer nroOrdenCompra;

    @NotNull
    private Integer nroSubledger;

    @Size(max=2)
    private String negocio;

    @NotNull
    private Integer planta;

    @NotNull
    private Integer centroCosto;

    @NotNull
    private Integer linea;

    @Size(max=100)
    private String cuentaObjeto;

    @Size(max=100)
    private String cuentaAuxiliar;

    @NotNull
    private Date fechaContable;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal importe;

    @Size(max=100)
    private String estadoProceso;

    @Size(max=100)
    private String compania;

    @Size(max=50)
    private String libro;
}
