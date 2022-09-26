package com.FM.INCOMESANDEGRESSESSYSTEMFV.service.Impl;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Empresa;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.repository.IEmpresaRepository;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

    @Autowired
    private IEmpresaRepository empresaRepository;


    @Override
    public Boolean update(Empresa empresa) throws Exception {
        LocalDate cat =empresa.getCreateAt();
        Empresa emp = empresaRepository.save(empresa);
        if(empresaRepository.findById(emp.getIdEmpresa())!=null){
            emp.setUpdateAt(LocalDate.now());
            emp.setCreateAt(cat);
            empresaRepository.save(emp);
            return true;
        }
        return false;

    }
    @Override
    public Boolean create(Empresa empresa) throws Exception {
        Empresa emp = empresaRepository.save(empresa);
        if(empresaRepository.findById(emp.getIdEmpresa())!=null){
            emp.setCreateAt(LocalDate.now());
            empresaRepository.save(emp);
            return true;
        }
        return false;
    }

    @Override
    public List<Empresa> readAll() throws Exception {
        return empresaRepository.findAll();
    }

    @Override
    public Empresa readById(Long id) throws Exception {
        return empresaRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) throws Exception {
        empresaRepository.deleteById(id);

    }

}
