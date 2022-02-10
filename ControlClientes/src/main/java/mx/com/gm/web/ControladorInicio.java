package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private IPersonaService iPersonaService;
    
    @GetMapping("/")
    public String inicio(Model model){
        
        var personas = iPersonaService.listaPersonas();
        log.info("Ejecutando el controdalor Spring MVC");
        model.addAttribute("personas", personas);
        return "index";
    }
}
