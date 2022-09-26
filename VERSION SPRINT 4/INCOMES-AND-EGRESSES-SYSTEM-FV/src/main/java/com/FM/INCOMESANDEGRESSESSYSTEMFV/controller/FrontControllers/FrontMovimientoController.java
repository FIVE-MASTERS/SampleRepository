package com.FM.INCOMESANDEGRESSESSYSTEMFV.controller.FrontControllers;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Empleado;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.MovimientoDinero;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.service.IEmpleadoService;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.service.IEmpresaService;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.service.IMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class FrontMovimientoController {
    @Autowired
    private IMovimientoDineroService movimientoDineroService;

    @Autowired
    private IEmpresaService empresaService;

    @Autowired
    private IEmpleadoService empleadoService;



    @GetMapping("/VerMovimientos")
    public String viewMovimientoDinero(@ModelAttribute("mensaje") String mensaje, Model model) throws Exception {
        List<MovimientoDinero> listamovimientos = movimientoDineroService.readAll();
        model.addAttribute("movlist",listamovimientos);
        model.addAttribute("mensaje",mensaje);
        return "verMovimientos";

    }

    @GetMapping("/AgregarMovimiento")
    public String nuevoMovimientoDinero(@ModelAttribute("mensaje") String mensaje,Model model) throws Exception {
        MovimientoDinero movimiento = new MovimientoDinero();
        model.addAttribute("mov",movimiento);
        model.addAttribute("mensaje",mensaje);
        List<Empleado> listaEmpleados = empleadoService.readAll();
        model.addAttribute("emplelist",listaEmpleados);
        return "agregarMovimiento";
    }

    @PostMapping("/GuardarMovimiento")
    public String guardarMovimientoDinero(MovimientoDinero mov, RedirectAttributes redirectAttributes) throws Exception {
        if(movimientoDineroService.create(mov)){
            redirectAttributes.addFlashAttribute("mensaje","saveOK");
            return "redirect:/VerMovimientos";
        }
        redirectAttributes.addFlashAttribute("mensaje","saveNOOK");
        return "redirect:/AgregarMovimiento";
    }

    @GetMapping("/EditarMovimiento/{id}")
    public String editarMovimientoDinero(@ModelAttribute("mensaje") String mensaje,Model model,@PathVariable Long id) throws Exception {
        MovimientoDinero mov = movimientoDineroService.readById(id).get();
        model.addAttribute("mov",mov);
        model.addAttribute("mensaje",mensaje);
        List<Empleado> listaempleados = empleadoService.readAll();
        model.addAttribute("emplelist",listaempleados);
        return "editarMovimiento";
    }

    /*
    @GetMapping("/EditarMovimiento/{id}")
    public String editarMovimientoDinero(@ModelAttribute("mensaje") String mensaje,Model model,@PathVariable Long id) throws Exception {
        Optional<MovimientoDinero> mov =movimientoDineroService.readById(id);
        model.addAttribute("mov",mov);
        model.addAttribute("mensaje",mensaje);
        List<Empleado> listaempleados = empleadoService.readAll();
        model.addAttribute("emplelist",listaempleados);
        return "editarMovimiento";
    }*/

    @PostMapping("/ActualizarMovimiento")
    public String actualizarMovimientoDinero(@ModelAttribute("mov") String mensaje, MovimientoDinero mov, RedirectAttributes redirectAttributes) throws Exception {
        if(movimientoDineroService.update(mov)==true){
            redirectAttributes.addFlashAttribute("mensaje","updateOK");
            return "redirect:/VerMovimientos";
        }
        redirectAttributes.addFlashAttribute("mensaje","updateError");
        return "redirect:/EditarMovimiento/"+mov.getIdMovimientoDinero();
    }

    @GetMapping("/EliminarMovimiento/{id}")
    public String eliminarMovimientoDinero(@PathVariable Long id, RedirectAttributes redirectAttributes) throws Exception {
        if (movimientoDineroService.delete(id)){
            redirectAttributes.addFlashAttribute("mensaje","deleteOK");
            return "redirect:/VerMovimientos";
        }
        redirectAttributes.addFlashAttribute("mensaje", "deleteError");
        return "redirect:/VerMovimientos";

    }

    @GetMapping("/Empleado/{id}/Movimientos") //movimientos por empleado
    public String movimientosPorEmpleado(@PathVariable("id") Long id,Model model) throws Exception {
        List<MovimientoDinero> movlist = movimientoDineroService.readByEmpleado(id);
        model.addAttribute("movlist",movlist);
        return "verMovimientos"; //llamamos al HTML
    }


    @GetMapping("/Empresa/{id}/Movimientos") //movimientos por empresa
    public String movimientosPorEmpresa(@PathVariable("id") Long id,Model model) throws Exception {
        List<MovimientoDinero> movlist =movimientoDineroService.readByEmpresa(id);
        model.addAttribute("movlist",movlist);
        return "verMovimientos"; // llamamos al HTML
    }



}
