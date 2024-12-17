package com.example.casino.service;

import com.example.casino.models.entity.CaConfiguracionGeneral;
import com.example.casino.models.entity.CaMovimiento;
import com.example.casino.models.entity.ReEmpleados;
import com.example.casino.models.repository.CaMovimientoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@AllArgsConstructor
@Service
public class CaMovimientoService {

    private final CaMovimientoRepository caMovimientoRepository;

    private final ReEmpleadoService reEmpleadoService;

    private final CaConfiguracionGeneralService caConfiguracionGeneral;

    /**
     * Metodo que lista los movimientos.
     *
     * @return lista de movimientos.
     */
    public List<CaMovimiento> listMovimientos() {
        return caMovimientoRepository.findAll();
    }


    public CaMovimiento guardarAlmuerzo(Long cedula) {
        ReEmpleados empleado = reEmpleadoService.buscarPorCedula(cedula);
        CaConfiguracionGeneral configuracionGeneral = caConfiguracionGeneral.getConfiguracionGeneral("ALMUERZO");
        CaMovimiento movimiento = CaMovimiento.builder()
                .id(devolverUltimoId() + 1)
                .caFecha(LocalDateTime.now())
                .caFechaDigita(LocalDateTime.now())
                .emCodigo(empleado.getEmCodigo())
                .emDocumento(empleado.getEmCedula().toString())
                .caValor(configuracionGeneral.getCgValor().toString())
                .build();
        return caMovimientoRepository.save(movimiento);
    }

    /**
     * Metodo que devuelve el ultimo id de la tabla.
     * @return ultimo id.
     */
    private Long devolverUltimoId() {
        return caMovimientoRepository.findTopByOrderById().orElseGet(() -> 0L);
    }
}
