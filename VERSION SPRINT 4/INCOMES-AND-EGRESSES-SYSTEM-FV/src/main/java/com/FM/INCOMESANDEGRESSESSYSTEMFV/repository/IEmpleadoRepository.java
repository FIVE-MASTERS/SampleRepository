package com.FM.INCOMESANDEGRESSESSYSTEMFV.repository;


import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado,Long> {
    @Query(value="SELECT * FROM empleados where empresa_id=?1", nativeQuery=true)
    public abstract ArrayList<Empleado> findByEmpresa(Long id);
}
