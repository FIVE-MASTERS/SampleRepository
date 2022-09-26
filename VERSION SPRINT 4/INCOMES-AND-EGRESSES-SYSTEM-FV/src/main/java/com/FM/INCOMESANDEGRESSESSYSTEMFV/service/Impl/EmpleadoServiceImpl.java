package com.FM.INCOMESANDEGRESSESSYSTEMFV.service.Impl;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Empleado;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.repository.IEmpleadoRepository;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

    @Autowired
    private IEmpleadoRepository empleadoRepository;

    @Override
    public Boolean create(Empleado empl) throws Exception {
        Empleado emp = empleadoRepository.save(empl);
        if(empleadoRepository.findById(emp.getIdEmpleado())!=null){
            emp.setCreateAt(LocalDate.now());
            empleadoRepository.save(emp);
            return true;
        }
        return false;

    }

    @Override
    public Boolean update(Empleado empl) throws Exception {
        LocalDate cat =empl.getCreateAt();
        Empleado emp = empleadoRepository.save(empl);
        if(empleadoRepository.findById(emp.getIdEmpleado())!=null){
            emp.setUpdateAt(LocalDate.now());
            emp.setCreateAt(cat);
            empleadoRepository.save(emp);
            return true;
        }
        return false;

    }

    @Override
    public List<Empleado> readAll() throws Exception {
        List<Empleado> empleadoList = new ArrayList<>();
        empleadoRepository.findAll().forEach(empleado -> empleadoList.add(empleado));
        return empleadoList;
    }

    @Override
    public Optional<Empleado> readById(Long id) throws Exception {
        return empleadoRepository.findById(id);
    }

    @Override
    public Boolean delete(Long id) throws Exception {
        empleadoRepository.deleteById(id);
        if(this.empleadoRepository.findById(id).isPresent()){
            return false;
        }
        return true;
    }
    @Override
    public ArrayList<Empleado> readByEmpresa(Long id) throws Exception{
        return empleadoRepository.findByEmpresa(id);
    }


}
