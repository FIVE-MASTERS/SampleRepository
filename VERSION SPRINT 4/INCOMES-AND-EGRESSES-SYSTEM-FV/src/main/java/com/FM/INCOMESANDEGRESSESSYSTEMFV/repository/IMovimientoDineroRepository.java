package com.FM.INCOMESANDEGRESSESSYSTEMFV.repository;


import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IMovimientoDineroRepository extends JpaRepository<MovimientoDinero,Long> {


    //Metodo para filtrar movimientos por empleado
    @Query(value ="SELECT * FROM movimientos_de_dinero where empleado_id= ?1", nativeQuery = true)
    public abstract ArrayList<MovimientoDinero> findByEmpleado(Long id );

    //Metodo para filtrar movimientos por empresa
    @Query(value="SELECT * FROM movimientos_de_dinero where id_empleado in (SELECT id_Empleado FROM empleados where empresa_id=?1)", nativeQuery = true)
    public abstract ArrayList<MovimientoDinero> findByEmpresa(Long id);

    /*
    //Metodo para ver la suma de TODOS LOS MOVIMIENTOS
    @Query(value="SELECT SUM(monto) from movimientos_de_dinero", nativeQuery = true)
    public abstract Long SumarMonto();

    //Metodo para ver la suma de los montos por empleado
    @Query(value="SELECT SUM(monto) from movimientos_de_dinero where empleado_id=?1", nativeQuery = true)
    public abstract Long MontosPorEmpleado(Long id); //id del empleado

    //Metodo para ver la suma de los movimientos por empresa
    @Query(value="select sum(monto) from movimientos_de_dinero where empleado_id in (select id from empleados where empresa_id= ?1)", nativeQuery = true)
    public abstract Integer IdPorCorreo(String correo);

     */

}
