package com.example.casino.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "CA_MOVIMIENTO")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CaMovimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ca_movimiento_seq")
    @SequenceGenerator(name = "ca_movimiento_seq", sequenceName = "CA_MOVIMIENTO_SEQ", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "EM_CODIGO", length = 15)
    private String emCodigo;

    @Column(name = "EM_DOCUMENTO", length = 25)
    private String emDocumento;

    @Column(name = "CA_FECHA")
    private LocalDateTime caFecha;

    @Column(name = "CA_VALOR", length = 10)
    private String caValor;

    @Column(name = "CA_FECHADIGITA")
    private LocalDateTime caFechaDigita;
}
