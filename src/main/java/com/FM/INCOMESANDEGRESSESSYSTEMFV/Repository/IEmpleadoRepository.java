package com.FM.INCOMESANDEGRESSESSYSTEMFV.Repository;


import com.FM.INCOMESANDEGRESSESSYSTEMFV.Model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado,Long> {




}
