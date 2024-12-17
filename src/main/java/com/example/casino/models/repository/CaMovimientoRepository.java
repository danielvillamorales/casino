package com.example.casino.models.repository;

import com.example.casino.models.entity.CaMovimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CaMovimientoRepository extends JpaRepository<CaMovimiento, Long> {

    /**
     * buscar ultimo id
     */
    @Query("SELECT max(cm.id) FROM CaMovimiento cm")
    Optional<Long> findTopByOrderById();
}
