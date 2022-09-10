package com.FM.INCOMESANDEGRESSESSYSTEMFV.repository;


import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovimientoDineroRepository extends JpaRepository<MovimientoDinero,Long> {
    //@Query(value = "select * from MovimientosDinero where=?1?2" , nativeQuery = true)
    //public abstract List<MovimientoDinero> movimientosEmpresa(Long id,Long newid);
}
