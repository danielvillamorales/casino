package com.example.casino.models.repository;

import com.example.casino.models.entity.CaConfiguracionGeneral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface CaConfiguracionGeneralRepository extends JpaRepository<CaConfiguracionGeneral, Long> {

    /**
     * buscar por codigo
     * @param codigo codigo
     */
    Optional<CaConfiguracionGeneral> findByCgCodigo(String codigo);
}
