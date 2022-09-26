package com.FM.INCOMESANDEGRESSESSYSTEMFV.service.Impl;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.MovimientoDinero;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.repository.IMovimientoDineroRepository;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.service.IMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovimientoDineroImpl implements IMovimientoDineroService {

    @Autowired
    private IMovimientoDineroRepository movimientoDineroRepository;


    @Override
    public Boolean create(MovimientoDinero movimiento) throws Exception {
        LocalDate cat = movimiento.getCreateAt();
        MovimientoDinero mov = movimientoDineroRepository.save(movimiento);
        if (movimientoDineroRepository.findById(mov.getIdMovimientoDinero()) != null) {
            mov.setCreateAt(LocalDate.now());
            mov.setUpdateAt(cat);
          //  movimientoDineroRepository.save(mov);
            return true;
        }
        return false;
    }

    @Override
    public Boolean update(MovimientoDinero movimiento) throws Exception {
        LocalDate cat = movimiento.getCreateAt();
        MovimientoDinero mov = movimientoDineroRepository.save(movimiento);
        if (movimientoDineroRepository.findById(mov.getIdMovimientoDinero()) != null) {
            mov.setCreateAt(LocalDate.now());
            mov.setUpdateAt(cat);
           // movimientoDineroRepository.save(mov);
            return true;
        }
        return false;
    }

    @Override
    public List<MovimientoDinero> readAll() throws Exception{
        List<MovimientoDinero> movimientoDineroList = new ArrayList<>();
        movimientoDineroRepository.findAll().forEach(movimientoDinero -> movimientoDineroList.add(movimientoDinero));
        return movimientoDineroList;
    }

    @Override
    public Optional <MovimientoDinero> readById(Long id) throws Exception{
        return movimientoDineroRepository.findById(id);
    }

    @Override
    public Boolean delete (Long id) throws Exception{
        movimientoDineroRepository.deleteById(id);
        if(this.movimientoDineroRepository.findById(id).isPresent()){
            return false;
        }
        return true;
    }
    @Override
    public ArrayList<MovimientoDinero> readByEmpleado(Long id) throws Exception{
        return movimientoDineroRepository.findByEmpleado(id);
    }

    @Override
    public ArrayList<MovimientoDinero> readByEmpresa(Long id) throws Exception{
        return movimientoDineroRepository.findByEmpresa(id);
    }



}

