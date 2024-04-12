package com.ayigroup.revision_asientos.entities;

import lombok.*;


import javax.persistence.*;
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
