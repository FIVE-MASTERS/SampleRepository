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


    @GetMapping("/user")
    public List<Empleado> readAll() throws Exception {
        return service.readAll();
    }

    @PostMapping("/user")
    public Empleado create(@RequestBody Empleado empleado) throws Exception {
        return service.create(empleado);
    }


    @GetMapping("user/{id}")
    public Empleado readById(@PathVariable("id") long id) throws Exception {
        return service.readById(id);
    }

    @PutMapping("user/{id}")
    public Empleado update(@RequestBody Empleado empleado) throws Exception {
        return service.update(empleado);
    }

    @DeleteMapping("user/{id}")
    public Empleado delete(@PathVariable("id") long id) throws Exception {
        return service.deleted(id);

    }
}





