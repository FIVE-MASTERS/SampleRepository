package com.FM.INCOMESANDEGRESSESSYSTEMFV.service;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.MovimientoDinero;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface IMovimientoDineroService {
    Boolean create(MovimientoDinero movimientodinero) throws Exception;
    Boolean update(MovimientoDinero movimientodinero) throws Exception;
    List<MovimientoDinero> readAll() throws Exception;
    Optional<MovimientoDinero> readById(Long id) throws Exception;
    Boolean delete(Long id)throws Exception;

    ArrayList<MovimientoDinero> readByEmpleado(Long id) throws Exception;

    ArrayList<MovimientoDinero> readByEmpresa(Long id) throws Exception;
}
