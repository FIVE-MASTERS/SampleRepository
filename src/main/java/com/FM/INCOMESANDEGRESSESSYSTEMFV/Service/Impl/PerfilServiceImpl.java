package com.FM.INCOMESANDEGRESSESSYSTEMFV.service.Impl;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Perfil;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.repository.IPerfilRepository;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.service.IPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PerfilServiceImpl implements IPerfilService {

    @Autowired
    private IPerfilRepository perfilRepository;

    @Override
    public Perfil create(Perfil perfil) throws Exception {
        return perfilRepository.save(perfil);
    }

    @Override
    public Perfil update(Perfil perfil) throws Exception {
        return perfilRepository.save(perfil);
    }

    @Override
    public List<Perfil> readAll() throws Exception {
        return perfilRepository.findAll();
    }

    @Override
    public Perfil readById(Long id) throws Exception {
        return perfilRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) throws Exception {
        perfilRepository.deleteById(id);
    }

}
