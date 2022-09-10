package com.FM.INCOMESANDEGRESSESSYSTEMFV.service.Impl;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Empresa;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.repository.IEmpresaRepository;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

    @Autowired
    private IEmpresaRepository empresaRepository;


    @Override
    public Empresa create(Empresa empresa) throws Exception {
        return empresaRepository.save(empresa);
    }

    @Override
    public Empresa update(Empresa empresa) throws Exception {
        return empresaRepository.save(empresa);
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
