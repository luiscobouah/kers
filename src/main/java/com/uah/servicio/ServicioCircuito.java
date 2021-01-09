package com.uah.servicio;

import com.uah.bbdd.Bbdd;
import com.uah.modelo.Circuito;
import com.uah.modelo.Coche;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class  ServicioCircuito extends HttpServlet {

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
        String nombre = (String) req.getParameter("nombre");
        String ciudad = (String) req.getParameter("ciudad");
        String pais = (String) req.getParameter("pais");
        String numeroVueltas = (String) req.getParameter("numeroVueltas");
        String longitudVuelta = (String) req.getParameter("longitudVuelta");
        String numeroCurvasVuelta = (String) req.getParameter("numeroCurvasVuelta");        
                
        Circuito circuito = new Circuito();
        circuito.setNombre(nombre);
        circuito.setCiudad(ciudad);
        circuito.setPais(pais);
        circuito.setNumeroVueltas(Integer.parseInt(numeroVueltas));
        circuito.setLongitudVuelta(Double.parseDouble(longitudVuelta));
        circuito.setNumeroCurvasVuelta(Integer.parseInt(numeroCurvasVuelta)); 
   
        if (bd.abrirConexion() == true) {
            if(bd.insertarCircuito(circuito)==true){
                s.setAttribute("objeto", "Circuito");
                res.sendRedirect(res.encodeRedirectURL("/KERS/correcto.jsp"));
            } else {
                s.setAttribute("objeto", "Circuito");
                res.sendRedirect(res.encodeRedirectURL("/KERS/error.jsp"));
            }          
        }  else {
            s.setAttribute("objeto", "Circuito");
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
	