package com.FM.INCOMESANDEGRESSESSYSTEMFV.Service.Impl;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.Model.MovimientoDeDinero;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.Repository.IMovimientoDeDineroRepository;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.Service.IMovimientoDeDineroService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovimientoDeDineroImpl implements IMovimientoDeDineroService {

    @Autowired
    private IMovimientoDeDineroRepository repo;


    @Override
    public MovimientoDeDinero create(MovimientoDeDinero movimientodedinero) throws Exception {
        return repo.save(movimientodedinero);
    }

    @Override
    public MovimientoDeDinero update(MovimientoDeDinero movimientodedinero) throws Exception {
        return repo.save(movimientodedinero);
    }

    @Override
    public List<MovimientoDeDinero> readAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public MovimientoDeDinero readById(long id) throws Exception {
        return repo.findById(id).orElse(null);
    }

    @Override
    public MovimientoDeDinero deleted(long id) throws Exception {
       repo.deleteById(id);
       return null;
    }
}
