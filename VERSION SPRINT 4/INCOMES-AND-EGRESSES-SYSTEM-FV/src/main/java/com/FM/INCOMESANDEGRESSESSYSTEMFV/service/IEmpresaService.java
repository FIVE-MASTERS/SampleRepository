package com.FM.INCOMESANDEGRESSESSYSTEMFV.service;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Empresa;
import java.util.List;

public interface IEmpresaService {

    Boolean create(Empresa empresa) throws Exception;
    Boolean update(Empresa empresa) throws Exception;

    List<Empresa> readAll() throws Exception;
    Empresa readById( Long id) throws Exception;
    void delete(Long id)throws Exception;

}
