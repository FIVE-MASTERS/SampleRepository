package com.FM.INCOMESANDEGRESSESSYSTEMFV.controller.RestControllers;


import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Empleado;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    private IEmpleadoService empleadoService;
/*

    @PostMapping("/user")
    public Empleado create(@RequestBody Empleado empleado) throws Exception {
        return empleadoService.create(empleado);
    }

    @GetMapping("/user")
    public List<Empleado> readAll() throws Exception {
        return empleadoService.readAll();
    }

    @GetMapping("/user/{id}")
    public Empleado readById(@PathVariable("id")  long id) throws Exception {
        return empleadoService.readById(id);
    }

    @PutMapping("/user/{id}")
    public Empleado update(@RequestBody Empleado empleado) throws Exception {
        return empleadoService.update(empleado);
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable("id") long id) throws Exception {
        empleadoService.delete(id);

    }*/
}





