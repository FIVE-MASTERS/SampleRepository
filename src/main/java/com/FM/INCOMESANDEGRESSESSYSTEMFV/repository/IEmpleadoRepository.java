package com.FM.INCOMESANDEGRESSESSYSTEMFV.repository;


import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado,Long> {

}
