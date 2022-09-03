package com.FM.INCOMESANDEGRESSESSYSTEMFV.Controller;


import com.FM.INCOMESANDEGRESSESSYSTEMFV.Model.Empleado;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.Service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class EmpleadoController {

    @Autowired
    private IEmpleadoService service;


    @GetMapping
    public List<Empleado> readAll() throws Exception {
        return service.readAll();
    }

    @PostMapping
    public Empleado create(@RequestBody Empleado empleado) throws Exception {
        return service.create(empleado);
    }


    @GetMapping("/{id}")
    public Empleado readById(@PathVariable("id") long id) throws Exception {
        return service.readById(id);
    }

    @PatchMapping
    public Empleado update(@RequestBody Empleado empleado) throws Exception {
        return service.update(empleado);
    }
    @PutMapping
    public Empleado create(idEmpleado idempleado) throws Exception {
        return service.create(idempleado);
    }

    @DeleteMapping
    public Empleado delete(@PathVariable("id") long id) throws Exception {
        return service.deleted(id);

    }
}





