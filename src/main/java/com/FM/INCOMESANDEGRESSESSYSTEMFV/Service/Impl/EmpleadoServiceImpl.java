package com.FM.INCOMESANDEGRESSESSYSTEMFV.Service.Impl;


import com.FM.INCOMESANDEGRESSESSYSTEMFV.Model.Empleado;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.Repository.IEmpleadoRepository;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.Service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

    @Autowired
    private IEmpleadoRepository repo ;


    @Override
    public Empleado create(Empleado empleado) throws Exception {
        return repo.save(empleado);
    }

    @Override
    public Empleado update(Empleado empleado) throws Exception {
        return repo.save(empleado);
    }

    @Override
    public List<Empleado> readAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Empleado readById(long id) throws Exception {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Empleado deleted(long id) throws Exception {
        repo.deleteById(id);

        return null;
    }
}
