package com.FM.INCOMESANDEGRESSESSYSTEMFV.Service;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.Model.MovimientoDeDinero;

import java.util.List;

public interface IMovimientoDeDineroService {
    MovimientoDeDinero create(MovimientoDeDinero movimientodedinero) throws Exception;
    MovimientoDeDinero update(MovimientoDeDinero movimientodedinero) throws Exception;
    List<MovimientoDeDinero> readAll() throws Exception;
    MovimientoDeDinero readById( long id) throws Exception;
    MovimientoDeDinero deleted (long id)throws Exception;
}
