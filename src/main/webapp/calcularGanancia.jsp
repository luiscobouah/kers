<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.util.*"%>
<%@ page import = "com.uah.modelo.Coche"%> 
<%@ page import = "com.uah.modelo.Circuito"%> 
<%@ page import = "com.uah.bbdd.Bbdd"%> 

<% Bbdd bd = new Bbdd();
   bd.abrirConexion(); 
%>
<head>      
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"/>
    <title>Calcular Ganancia</title>
    <link rel="stylesheet" href="css/main.css"> 
    <script src="main.js"></script>
</head>    
<body>
    <header class="site-header inicio">
        <div class="contenedor contenido-header">
           <h1>Simulación Sistema KERS</h1>
        </div>
    </header>
    <section class="contenedor seccion"> 
        <h1>Calcular Ganancia</h1>
        <div class="calcularGanancia">            
            <div class="selectDiv">
                <select id="coche" name="coche" property="coche" required>
                    <option disabled selected>Seleccione un Coche</option>
                    <%
                    //Mostramos por pantalla la lista de coches obtenida de la BBDD.
                    ArrayList arrayListCoche = (ArrayList) bd.listadoCoches();
                    for (int i = 0; i < arrayListCoche.size(); i++) {
                        Coche coche = (Coche) arrayListCoche.get(i);
                        System.out.println("cocheJsp " + coche.getNombreCoche());
                    %>
                    <option value="<%=coche.getGananciaCurva()%>"><%=coche.getNombreCoche()%></option>
                    <%
                        }
                    %>
               </select>  
               <select id="circuito" name="circuito" property="circuito" required>
                    <option disabled selected>Seleccione un Circuito</option>
                    <%
                    //Mostramos por pantalla la lista de circuitos obtenida de la BBDD.
                            ArrayList arrayListCircuito = (ArrayList) bd.listadoCircuitos();
                            for (int i = 0; i < arrayListCircuito.size(); i++) {
                                    Circuito circuito = (Circuito) arrayListCircuito.get(i);
                    %>
                    <option value="<%=circuito.getNumeroVueltas()*circuito.getNumeroCurvasVuelta()%>"><%=circuito.getNombre()%></option>
                    <%
                            }
                    %>
               </select> 
            </div> 
           <div class="resultadoGancia" id="resultado"></div>    
           <button type="button" class="boton" onclick="calcularGanancia()">Calcular</button>
           <a href="index.html"><button type="button" class="boton" >Volver</button></a>            
        </div>  
    </section>
 </body>
</html>