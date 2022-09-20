package com.FM.INCOMESANDEGRESSESSYSTEMFV.controller.RestControllers;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Perfil;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.service.IPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PerfilController {

    @Autowired
    private IPerfilService perfilService;

    @GetMapping("/profile")
    public List<Perfil> readAll() throws Exception {
        return perfilService.readAll();
    }

    @PostMapping("/profile")
    public Perfil create(@RequestBody Perfil perfil) throws Exception {
        return perfilService.create(perfil);
    }


    @GetMapping("/profile/{id}")
    public Perfil readById(@PathVariable("id") Long id) throws Exception {
        return perfilService.readById(id);
    }

    @PutMapping("/profile")
    public Perfil update(@RequestBody Perfil perfil) throws Exception {
        return perfilService.update(perfil);
    }

    @DeleteMapping("/profile/{id}")
    public void delete(@PathVariable("id") Long id) throws Exception {
        perfilService.delete(id);

    }

}
