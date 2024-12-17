package com.example.casino.controller;

import com.example.casino.models.entity.CaMovimiento;
import com.example.casino.service.CaMovimientoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/movimiento")
public class CaMovimientoController {

    private final CaMovimientoService caMovimientoService;

    /**
     * Metodo que lista los movimientos.
     * @return lista de movimientos.
     */
    @GetMapping("/all")
    ResponseEntity<List<CaMovimiento>> listar(){
        return new ResponseEntity<>(caMovimientoService.listMovimientos(), HttpStatus.OK);
    }

    /**
     * metodo para guardar un movimiento de almuerzo.
     * @param cedula cedula del empleado.
     * @return movimiento guardado.
     */
    @PostMapping("/almuerzo")
    ResponseEntity<CaMovimiento> guardarAlmuerzo(@RequestParam Long cedula){
        return new ResponseEntity<>(caMovimientoService.guardarAlmuerzo(cedula), HttpStatus.OK);
    }
}
