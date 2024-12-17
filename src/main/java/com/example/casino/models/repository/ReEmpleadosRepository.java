package com.example.casino.models.repository;

import com.example.casino.models.entity.ReEmpleados;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface ReEmpleadosRepository extends JpaRepository<ReEmpleados, String> {


    /**
     * buscar por cedula ordenado por el codigo de empleado descendente
     *
     * @param cedula cedula
     * @return empleados
     */
    List<ReEmpleados> findByEmCedulaOrderByEmCodigoDesc(Long cedula);

    /**
     * Buscar por nombre o cedula y que activos sea S, paginar los primeros 15
     *
     * @param nombreOcedula nombre o cedula
     * @return empleados
     */
    @Query("SELECT e FROM ReEmpleados e WHERE (upper(e.emNombre) LIKE %:nombreOcedula% " +
            "OR to_char(e.emCedula) LIKE %:nombreOcedula%) and emActivo = 'S' AND ROWNUM <= 15 ")
    List<ReEmpleados> findTop15ByEmNombreContainingOrEmCedulaAndEmActivoOrderByEmCodigoDesc(@Param("nombreOcedula")
                                                                                            String nombreOcedula);

}
