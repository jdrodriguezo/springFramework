package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import mx.com.gm.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Persona persona){
        iPersonaService.guardar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idPersona}") // el valor debe ser axactamente igual a el atributo de la clase que queremos que se inicialice
    public String editar(Persona persona, Model model){
        persona = iPersonaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Persona persona){
        iPersonaService.eliminar(persona);
        return "redirect:/";
    }
}
