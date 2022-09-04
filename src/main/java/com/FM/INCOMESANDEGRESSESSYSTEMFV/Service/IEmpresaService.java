package com.FM.INCOMESANDEGRESSESSYSTEMFV.Service;


import com.FM.INCOMESANDEGRESSESSYSTEMFV.Model.Empresa;
import java.util.List;

public interface IEmpresaService {

    Empresa create(Empresa empresa) throws Exception;
    Empresa update(Empresa empresa) throws Exception;
    List<Empresa> readAll() throws Exception;
    Empresa readById( long id) throws Exception;
    Empresa deleted (long id)throws Exception;

}
