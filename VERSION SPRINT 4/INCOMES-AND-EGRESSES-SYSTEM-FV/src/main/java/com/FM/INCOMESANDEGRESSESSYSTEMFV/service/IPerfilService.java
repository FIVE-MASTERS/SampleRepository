package com.FM.INCOMESANDEGRESSESSYSTEMFV.service;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Perfil;

import java.util.List;


public interface IPerfilService  {

    Perfil create(Perfil perfil) throws Exception;
    Perfil update(Perfil perfil) throws Exception;
    List<Perfil> readAll() throws Exception;
    Perfil readById(Long id) throws Exception;
    void delete(Long id) throws Exception;
}
