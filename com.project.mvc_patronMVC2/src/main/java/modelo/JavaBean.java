package modelo;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;

@SessionScoped
public class JavaBean implements Serializable{
    private String mensaje = "Mensaje desde el javaBean";
    
    public JavaBean(){
    }
    
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
