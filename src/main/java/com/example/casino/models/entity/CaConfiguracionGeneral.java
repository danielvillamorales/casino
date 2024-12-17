package com.example.casino.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CA_CONFIGURACION_GENERAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CaConfiguracionGeneral {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "ca_configuracion_general_seq")
    private Long id;

    @Column(name = "CG_CODIGO", length = 10)
    private String cgCodigo;

    @Column(name = "CG_VALOR", length = 100)
    private Long cgValor;
}
