<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
<head>      
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"/>
    <title>Nuevo Coche</title>
    <link rel="stylesheet" href="css/main.css">    
</head>    
<body>
    <header class="site-header inicio">
        <div class="contenedor contenido-header">
           <h1>Simulación Sistema KERS</h1>
        </div>
    </header>
    <section class="contenedor seccion"> 
        <h1>Nuevo Circuito</h1>
        <div class="nuevoCircuito">            
           <form action="/KERS/ServicioCircuito" method="POST"> 
            <div class="formulario">   
                <p class="campoFormulario"> Nombre <input type="text" id="nombre" name="nombre" required></p>
                <p class="campoFormulario"> Ciudad <input type="text" id="ciudad" name="ciudad" required></p>
                <p class="campoFormulario"> Pais   <input type="text" id="pais" name="pais" required></p>
                <p class="campoFormulario"> Numero De Vueltas <input  type="number" id="numeroVueltas" name="numeroVueltas" min="40" max="80" required></p>
                <p class="campoFormulario"> Longitud De Vuelta <input  type="number" id="longitudVuelta" name="longitudVuelta" min="3000" max="9000" required></p>
                <p class="campoFormulario"> Numero De Curvas/Vuelta <input  type="number" id="numeroCurvasVuelta" name="numeroCurvasVuelta" min="6" max="20" required></p>
                <input type="submit" name="B1" value="Guardar" class="boton">    
                <input type="reset" value="Borrar" class="boton">
                <a href="index.html"><button type="button" class="boton" >Volver</button></a>
            </div>
           </form>       
        </div>
    </section>
 </body>
</html>