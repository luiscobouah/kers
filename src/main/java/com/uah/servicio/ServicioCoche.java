package com.uah.servicio;


import com.uah.bbdd.Bbdd;
import com.uah.modelo.Coche;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ServicioCoche extends HttpServlet {

    private Bbdd bd;

    @Override
    public void init(ServletConfig cfg) throws ServletException {
        bd = new Bbdd();
        bd.abrirConexion();
    }

    /**
     *
     * @param req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession s = req.getSession(true);
        String nombreCoche = (String) req.getParameter("nombreCoche");
        String gananciaCurva = (String) req.getParameter("gananciaCurva");
               
        Coche coche = new Coche();
        coche.setNombreCoche(nombreCoche);
        coche.setGananciaCurva(Double.parseDouble(gananciaCurva));
   
        if (bd.abrirConexion() == true) {
            if(bd.insertarCoche(coche)==true){
                s.setAttribute("objeto", "Coche");
                res.sendRedirect(res.encodeRedirectURL("/KERS/correcto.jsp"));
            } else {
                s.setAttribute("objeto", "Coche");
                res.sendRedirect(res.encodeRedirectURL("/KERS/error.jsp"));
            }          
        }  else {
             s.setAttribute("objeto", "Coche");
             res.sendRedirect(res.encodeRedirectURL("/KERS/error.jsp"));
        }    

    }
    /**
     *
     */
    @Override
    public void destroy() {
        bd.cerrarConexion();
        super.destroy();
    }
}

	
    
    
        
     
    
        
    
    

