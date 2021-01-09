package com.uah.bbdd;

import com.uah.modelo.Circuito;
import com.uah.modelo.Coche;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Bbdd {
    private static Connection con;
    private static Statement set;

    /* 
     MÉTODO PARA ABRIR LA CONEXIÓ CON LA BBDD.
    */
    public static Boolean abrirConexion() {		
            try {

                    Class.forName("org.apache.derby.jdbc.ClientDriver");			
                    con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                    System.out.println("Se ha conectado");
            } catch (Exception e) {
                    return false;
            }

            return true;
    }
    /* 
     MÉTODO PARA CERRAR LA CONEXIÓN CON LA BBDD.
    */
    public static void cerrarConexion() {
            try {
                    con.close();
            } catch (Exception e) {

            }
    }
    /* 
     MÉTODO PARA INSERTAR UN COCHE EN LA BBDD 
    */
    public static Boolean insertarCoche(Coche coche) {
            try {
                    String nombre = coche.getNombreCoche();
                    double gananciaCurva = coche.getGananciaCurva();
                    set = con.createStatement();
                    set.executeUpdate("INSERT INTO COCHE"
                                    + " (NOMBRE,GANANCIA_CURVA) VALUES ('" + nombre + "',"+ gananciaCurva +")");
                    //rs.close();
                    set.close();
            } catch (Exception e) {
                    System.out.println("ErrorCoche = " + e);
                    return false;
            }
            return true;
    }
    /*	
     MÉTODO PARA INSERTAR UN CIRCUITO EN LA BBDD 
    */
    public static Boolean insertarCircuito(Circuito circuito) {
            try {
                    String nombre = circuito.getNombre();
                    String ciudad = circuito.getCiudad();
                    String pais = circuito.getPais();
                    int numeroVueltas = circuito.getNumeroVueltas();
                    double longitudVueltas = circuito.getLongitudVuelta();
                    int numeroCurvasVuelta = circuito.getNumeroCurvasVuelta();

                    set = con.createStatement();
                    set.executeUpdate("INSERT INTO CIRCUITO"
                                    + " (NOMBRE,CIUDAD,PAIS,NUMERO_VUELTAS,LONG_VUELTA,CURVAS_VUELTA) VALUES ('" + nombre + "','"+ ciudad +"','"
                                          + pais + "',"+ numeroVueltas +","+ longitudVueltas + ","+ numeroCurvasVuelta +")");
                    //rs.close();
                    set.close();
            } catch (Exception e) {
                    return false;
            }
            return true;
    }
    /* 
     METODO PARA OBTENER UN ARRAY CON TODOS LOS COCHES DE QUE EXISTEN EN LA BBDD 
    */
    public static  ArrayList<Coche> listadoCoches()
       {
          ArrayList<Coche> listaCoches=new ArrayList<Coche>();
          try
          {	        
             set = con.createStatement();	        
             ResultSet rs = set.executeQuery("select * from COCHE" );
             while (rs.next())	         {
                Coche coche = new Coche();

                coche.setNombreCoche(rs.getString("NOMBRE"));
                coche.setGananciaCurva(rs.getDouble("GANANCIA_CURVA"));

                listaCoches.add(coche);
             }
             rs.close();
             set.close();	         
          }
          catch (Exception e)
          {
             e.printStackTrace();
          }
          return listaCoches;

       }

    /* 
     METODO PARA OBTENER UN ARRAY CON TODOS LOS CIRCUITOS DE QUE EXISTEN EN LA BBDD 
    */
    public static  ArrayList<Circuito> listadoCircuitos()
       {
          ArrayList<Circuito> listaCircuito =new ArrayList<Circuito>();
          try
          {	        
             set = con.createStatement();	        
             ResultSet rs = set.executeQuery("select * from CIRCUITO" );
             while (rs.next())	         {
                Circuito circuito = new Circuito();

                circuito.setNombre(rs.getString("NOMBRE"));
                circuito.setCiudad(rs.getString("CIUDAD"));
                circuito.setPais(rs.getString("PAIS"));
                circuito.setNumeroVueltas(rs.getInt("NUMERO_VUELTAS"));
                circuito.setLongitudVuelta(rs.getDouble("LONG_VUELTA"));
                circuito.setNumeroCurvasVuelta(rs.getInt("CURVAS_VUELTA"));

                listaCircuito.add(circuito);
             }
             rs.close();
             set.close();	         
          }
          catch (Exception e)
          {
             e.printStackTrace();
          }
          return listaCircuito;

       }
}

