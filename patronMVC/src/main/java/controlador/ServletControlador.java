package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
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
        
        //2. CREMOS LOS JAVABEANS
        Rectangulo rectangulo = new Rectangulo(3,6);
        
        //3. AGREGAMOS EL JAVABEAN A ALGUN ALCANCE
        request.setAttribute("mensaje", "saludo desde el servlet.");
        
        HttpSession session = request.getSession();
        session.setAttribute("rectangulo", rectangulo);
        
        //4. REDIRECCIONAR A LA VISTA SELECCIONADA
        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarDispatcher.jsp");
        rd.forward(request, response);
    }
}
