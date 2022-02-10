package mx.com.gm.web;

import java.util.ArrayList;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.dao.IPersonaDao;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private IPersonaDao iPersonaDao;
    
    @GetMapping("/")
    public String inicio(Model model){
        
        var personas = iPersonaDao.findAll();
        log.info("Ejecutando el controdalor Spring MVC");
        model.addAttribute("personas", personas);
        return "index";
    }
}
