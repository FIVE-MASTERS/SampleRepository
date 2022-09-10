package com.FM.INCOMESANDEGRESSESSYSTEMFV.controller;



import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.MovimientoDinero;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.service.IMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovimientoDineroController {

    @Autowired
    private IMovimientoDineroService movimientoDineroService;
    @GetMapping("/movements")
    public List<MovimientoDinero> readAll() throws Exception {
        return movimientoDineroService.readAll();
    }
    @PostMapping("/movements")
    public MovimientoDinero create(@RequestBody MovimientoDinero movimientodinero) throws Exception {
        return movimientoDineroService.create(movimientodinero);
    }
    @GetMapping("/movements/{id}")
    public MovimientoDinero readById(@PathVariable("id") long id) throws Exception {
        return movimientoDineroService.readById(id);
    }

    @PutMapping("/movements/{id}")
    public MovimientoDinero update(@RequestBody MovimientoDinero movimientodinero) throws Exception {
        return movimientoDineroService.update(movimientodinero);
    }

    @DeleteMapping("/movements/{id}")
    public void delete(@PathVariable("id") long id) throws Exception {
        movimientoDineroService.delete(id);

    }


}
