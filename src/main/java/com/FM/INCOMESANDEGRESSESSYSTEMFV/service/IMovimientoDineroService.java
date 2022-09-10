package com.FM.INCOMESANDEGRESSESSYSTEMFV.service;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.MovimientoDinero;

import java.util.List;

public interface IMovimientoDineroService {
    MovimientoDinero create(MovimientoDinero movimientodinero) throws Exception;
    MovimientoDinero update(MovimientoDinero movimientodinero) throws Exception;
    List<MovimientoDinero> readAll() throws Exception;
    MovimientoDinero readById(Long id) throws Exception;
    void delete(Long id)throws Exception;
}
