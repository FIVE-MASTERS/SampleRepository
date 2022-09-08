package com.FM.INCOMESANDEGRESSESSYSTEMFV.Service.Impl;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.Model.MovimientoDeDinero;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.Repository.IMovimientoDeDineroRepository;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.Service.IMovimientoDeDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public MovimientoDeDinero readById(Long id) throws Exception {
        return repo.findById(id).orElse(null);
    }

    @Override
    public MovimientoDeDinero deleted(Long id) throws Exception {
       repo.deleteById(id);
       return null;
    }
}
