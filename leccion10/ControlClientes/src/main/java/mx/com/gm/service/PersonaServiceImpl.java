package mx.com.gm.service;

import java.util.List;
import mx.com.gm.dao.IPersonaDao;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements IPersonaService{

    @Autowired
    private IPersonaDao iPersonaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Persona> listaPersonas() {
        return (List<Persona>) iPersonaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        iPersonaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        iPersonaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        return iPersonaDao.findById(persona.getIdPersona()).orElse(null);
    }
    
}
