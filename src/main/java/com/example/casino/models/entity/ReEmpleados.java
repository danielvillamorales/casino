package com.example.casino.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "RE_EMPLEADOS", schema = "KACA")
@Data
public class ReEmpleados {

    @Id
    @Column(name = "EM_CODIGO", length = 10, nullable = false)
    private String emCodigo;

    @Column(name = "EM_NOMBRE", length = 50)
    private String emNombre;

    @Column(name = "EM_CARGO", length = 5)
    private String emCargo;

    @Column(name = "EM_TIPODENOMINA", length = 2)
    private String emTipoDeNomina;

    @Column(name = "EM_CENTROCOSTO", length = 10)
    private String emCentroCosto;

    @Column(name = "EM_ACTIVO", length = 1)
    private String emActivo;

    @Column(name = "EM_RETIRADO", length = 1)
    private String emRetirado;

    @Column(name = "EM_CODIGONOMINA", length = 15)
    private String emCodigoNomina;

    @Column(name = "EM_TIENEHUELLA", length = 1)
    private String emTieneHuella;

    @Column(name = "EM_FORMAPAGO", length = 2)
    private String emFormaPago;

    @Column(name = "EM_CEDULA")
    private Long emCedula;

}
