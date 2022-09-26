package com.FM.INCOMESANDEGRESSESSYSTEMFV.controller.FrontControllers;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Empleado;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Empresa;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
public class FrontEmpresaController {
    @Autowired
    private IEmpresaService empresaService;


    @GetMapping({"/","/VerEmpresas"})
    public String viewEmpresas(@ModelAttribute("mensaje") String mensaje, Model model) throws Exception {
        List<Empresa> listaEmpresas = empresaService.readAll();
        model.addAttribute("emplist",listaEmpresas);
        model.addAttribute("mensaje",mensaje);
        return "verEmpresas";

    }

    @GetMapping("/AgregarEmpresa")
    public String nuevaEmpresa(@ModelAttribute("mensaje") String mensaje,Model model){
        Empresa emp = new Empresa();
        model.addAttribute("emp",emp);
        model.addAttribute("mensaje",mensaje);
        return "agregarEmpresa";
    }

    @PostMapping("/GuardarEmpresa")
    public String guardarEmpresa(Empresa emp, RedirectAttributes redirectAttributes) throws Exception {
        if(empresaService.create(emp)==true){
            redirectAttributes.addFlashAttribute("mensaje","saveOK");
            return "redirect:/VerEmpresas";
        }
        redirectAttributes.addFlashAttribute("mensaje","saveNOOK");
        return "redirect:/AgregarEmpresa";
    }
    @GetMapping("/EditarEmpresa/{id}")
    public String editarEmpresas(@ModelAttribute("mensaje") String mensaje,Model model,@PathVariable Long id) throws Exception {
        Empresa emp = empresaService.readById(id);
        model.addAttribute("emp",emp);
        model.addAttribute("mensaje",mensaje);
       return "editarEmpresa";
    }

    @PostMapping("/ActualizarEmpresa")
    public String actualizarEmpresa(@ModelAttribute("mensaje") String mensaje,@ModelAttribute("emp") Empresa emp, RedirectAttributes redirectAttributes) throws Exception {
        if(empresaService.update(emp)==true){
            redirectAttributes.addFlashAttribute("mensaje","updateOK");
            return "redirect:/VerEmpresas";
        }
        redirectAttributes.addFlashAttribute("mensaje","updateError");
        return "redirect:/EditarEmpresa/"+emp.getIdEmpresa();
    }

    @GetMapping("/EliminarEmpresa/{id}")
    public String eliminarEmpresa(@ModelAttribute("mensaje") String mensaje,@PathVariable Long idEmpresa, RedirectAttributes redirectAttributes) throws Exception {
        empresaService.delete(idEmpresa);
        if (empresaService.readById(idEmpresa)==null){
            redirectAttributes.addFlashAttribute("mensaje","deleteOK");
            return "redirect:/VerEmpresas";
        }
        redirectAttributes.addFlashAttribute("mensaje", "deleteError");
        return "redirect:/VerEmpresas";
    }




}
