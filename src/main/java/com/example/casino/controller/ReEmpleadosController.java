package com.example.casino.controller;

import com.example.casino.models.entity.ReEmpleados;
import com.example.casino.service.ReEmpleadoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/empleados")
@AllArgsConstructor
public class ReEmpleadosController {

    private final ReEmpleadoService reEmpleadoService;

    @GetMapping("/buscar")
    ResponseEntity<List<ReEmpleados>> buscarPorNombreOCedula(@RequestParam String nombreOCedula){
        return ResponseEntity.ok(reEmpleadoService.listarPorNombreOrCedula(nombreOCedula));
    }
}
