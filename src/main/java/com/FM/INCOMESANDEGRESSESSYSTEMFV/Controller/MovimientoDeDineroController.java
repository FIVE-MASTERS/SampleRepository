package com.FM.INCOMESANDEGRESSESSYSTEMFV.Controller;



import com.FM.INCOMESANDEGRESSESSYSTEMFV.Model.MovimientoDeDinero;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.Service.IMovimientoDeDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enterprise/{id}/movements")
public class MovimientoDeDineroController {

    @Autowired
    private IMovimientoDeDineroService service;
    @GetMapping
    public List<MovimientoDeDinero> readAll() throws Exception {
        return service.readAll();
    }

    @PostMapping
    public MovimientoDeDinero create(@RequestBody MovimientoDeDinero movimientodinero) throws Exception {
        return service.create(movimientodinero);
    }


    @GetMapping
    public MovimientoDeDinero readById(@PathVariable("id") Long id) throws Exception {
        return service.readById(id);
    }

    @PutMapping
    public MovimientoDeDinero update(@RequestBody MovimientoDeDinero movimientodinero) throws Exception {
        return service.update(movimientodinero);
    }

    @DeleteMapping
    public MovimientoDeDinero delete(@PathVariable("id") Long id) throws Exception {
        return service.deleted(id);

    }




}
