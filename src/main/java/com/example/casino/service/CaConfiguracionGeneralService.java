package com.example.casino.service;

import com.example.casino.models.entity.CaConfiguracionGeneral;
import com.example.casino.models.repository.CaConfiguracionGeneralRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CaConfiguracionGeneralService {

    private final CaConfiguracionGeneralRepository caConfiguracionGeneralRepository;

    /**
     * Metodo que obtiene la configuracion general.
     * @param codigo codigo
     * @return configuracion general.
     */
    public CaConfiguracionGeneral getConfiguracionGeneral(String codigo) {
        return caConfiguracionGeneralRepository.findByCgCodigo(codigo).orElseGet(() ->
                CaConfiguracionGeneral.builder()
                        .cgValor(9400L)
                        .build());
    }
}
