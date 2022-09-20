package com.FM.INCOMESANDEGRESSESSYSTEMFV.controller.FrontControllers;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Empresa;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FrontEmpresaController {
    @Autowired
    private IEmpresaService empresaService;


    @GetMapping({"/","verEmpresas"})
    public String viewEmpresas(Model model) throws Exception {
        model.addAttribute("enterprises",empresaService.readAll());
        return "verEmpresas";

    }

    @GetMapping("/AgregarEmpresa")
    public String nuevaEmpresa(Model model){
        Empresa emp = new Empresa();
        model.addAttribute("emp",emp);
        return "agregarEmpresa";
    }
}
