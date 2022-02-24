package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //1. PROCESAR LOS PARAMETROS
        String accion = request.getParameter("accion");
        //2. CREMOS LOS JAVABEANS
        Rectangulo recRequest = new Rectangulo(1,2);
        Rectangulo recSession = new Rectangulo(3,4);
        Rectangulo recApplication = new Rectangulo(5,6);
        
        //3. AGREGAMOS EL JAVABEAN A ALGUN ALCANCE
         
        //REVISAMOS LA ACCION PROPORSIONADA
        if("agregarVariables".equals(accion)){
            //ALCANCE REQUEST
            request.setAttribute("ractanguloRequest", recRequest);
            
            //ALCANSE SESION
            HttpSession session = request.getSession();
            session.setAttribute("rectanguloSession", recSession);
            
            //ALCANCE APLICACION
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloApplication", recApplication);
            
            //AGREGAR UN MENSAJE
            request.setAttribute("mensaje", "Las variables fueron agregadas");
            
            //REDIRECCIONAR A INICIO
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        } else if("listarVariables".equals(accion)){
            //REDIRECCIONAR AL JSP QUE DESPLIEGA LAS VARIABLES
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        } else{
            //REDIRECCIONAR A PAGINA DE INICIO
            request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        
    }
}
