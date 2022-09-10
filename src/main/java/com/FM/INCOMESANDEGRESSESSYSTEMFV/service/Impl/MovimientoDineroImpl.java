package com.FM.INCOMESANDEGRESSESSYSTEMFV.service.Impl;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.MovimientoDinero;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.repository.IMovimientoDineroRepository;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.service.IMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoDineroImpl implements IMovimientoDineroService {

    @Autowired
    private IMovimientoDineroRepository movimientoDineroRepository;


    @Override
    public MovimientoDinero create(MovimientoDinero movimientodinero) throws Exception {
        return movimientoDineroRepository.save(movimientodinero);
    }

    @Override
    public MovimientoDinero update(MovimientoDinero movimientodinero) throws Exception {
        return movimientoDineroRepository.save(movimientodinero);
    }

    @Override
    public List<MovimientoDinero> readAll() throws Exception {
        return movimientoDineroRepository.findAll();
    }

    @Override
    public MovimientoDinero readById(Long id) throws Exception {
        return movimientoDineroRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) throws Exception {
        movimientoDineroRepository.deleteById(id);

    }
}
