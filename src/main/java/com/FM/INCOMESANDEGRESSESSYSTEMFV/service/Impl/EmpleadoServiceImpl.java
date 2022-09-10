package com.FM.INCOMESANDEGRESSESSYSTEMFV.service.Impl;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Empleado;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.repository.IEmpleadoRepository;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

    @Autowired
    private IEmpleadoRepository empleadoRepository;

    @Override
    public Empleado create(Empleado empleado) throws Exception {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado update(Empleado empleado) throws Exception {
        return empleadoRepository.save(empleado);
    }

    @Override
    public List<Empleado> readAll() throws Exception {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado readById(Long id) throws Exception {
        return empleadoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) throws Exception {
        empleadoRepository.deleteById(id);

    }
}
