package com.empleados.demo;
import com.empleados.demo.model.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

public interface EmpleadosRepository extends JpaRepository<Empleados,Long> {
    @Query("SELECT c FROM empleado c WHERE c.nombre=?1")
    default Optional<Empleados> findByName(String name) {
        return null;
    }
}
