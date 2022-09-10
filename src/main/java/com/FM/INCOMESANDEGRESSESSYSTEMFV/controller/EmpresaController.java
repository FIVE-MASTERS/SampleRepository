package com.FM.INCOMESANDEGRESSESSYSTEMFV.controller;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Empresa;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmpresaController {
    @Autowired
    private IEmpresaService empresaService;


    @PostMapping("/enterprise")
    public Empresa create(@RequestBody Empresa empresa) throws Exception {
        return empresaService.create(empresa);
    }
    @GetMapping("/enterprise")
    public List<Empresa> readAll() throws Exception {
     return empresaService.readAll();}

    @GetMapping("/enterprise/{id}")
    public Empresa readById(@PathVariable("id") long id) throws Exception {
        return empresaService.readById(id);
    }

    @PutMapping("/enterprise/{id}")
    public Empresa update(@RequestBody Empresa empresa) throws Exception {
        return empresaService.update(empresa);
    }

    @DeleteMapping("/enterprise/{id}")
    public void delete(@PathVariable("id") long id) throws Exception {
        empresaService.delete(id);

    }
}
