package com.FM.INCOMESANDEGRESSESSYSTEMFV.Controller;


import com.FM.INCOMESANDEGRESSESSYSTEMFV.Model.Empresa;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.Service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enterprise")
public class EmpresaController {
    @Autowired
    private IEmpresaService service;


    @GetMapping("/enterprise")
    public List<Empresa> readAll() throws Exception {
        return service.readAll();
    }

    @PostMapping("/enterprise")
    public Empresa create(@RequestBody Empresa empresa) throws Exception {
        return service.create(empresa);
    }


    @GetMapping("/enterprise/{id}")
    public Empresa readById(@PathVariable("id") Long id) throws Exception {
        return service.readById(id);
    }

    @PutMapping("/enterprise/{id}")
    public Empresa update(@RequestBody Empresa empresa) throws Exception {
        return service.update(empresa);
    }

    @DeleteMapping("/enterprise/{id}")
    public Empresa delete(@PathVariable("id") Long id) throws Exception {
        return service.deleted(id);

    }
}
