package com.FM.INCOMESANDEGRESSESSYSTEMFV.Repository;


import com.FM.INCOMESANDEGRESSESSYSTEMFV.Model.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovimientoDineroRepository extends JpaRepository<MovimientoDinero,Long> {
}
