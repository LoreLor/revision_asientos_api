package com.ayigroup.revision_asientos.entities.dtos;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class AsientoDTO {
    private Integer id;
    private Integer documento;
    private String tipoDocumento;
    private String compania;
    private String unidadDeNegocio;
    private String cuentaObjeto;
    private String cuentaAuxiliar;
    private String libro;
    private Integer lieneaAsiento;
    private Date fechaContable;
}
