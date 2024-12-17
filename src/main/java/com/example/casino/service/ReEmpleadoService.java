package com.example.casino.service;

import com.example.casino.models.entity.ReEmpleados;
import com.example.casino.models.repository.ReEmpleadosRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ReEmpleadoService {

    private final ReEmpleadosRepository reEmpleadoRepository;

    public List<ReEmpleados> listarPorNombreOrCedula(String nombreOcedula) {
        return reEmpleadoRepository.findTop15ByEmNombreContainingOrEmCedulaAndEmActivoOrderByEmCodigoDesc(
                nombreOcedula.toUpperCase());
    }

    public ReEmpleados buscarPorCedula(Long cedula){
        return reEmpleadoRepository.findByEmCedulaOrderByEmCodigoDesc(cedula).getFirst();
    }
}
