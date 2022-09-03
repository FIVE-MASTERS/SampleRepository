package com.FM.INCOMESANDEGRESSESSYSTEMFV.Repository;


import com.FM.INCOMESANDEGRESSESSYSTEMFV.Model.MovimientoDeDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovimientoDeDineroRepository extends JpaRepository<MovimientoDeDinero,Long> {
}
